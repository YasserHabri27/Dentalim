package ma.dentalim.dao.implementation;

import ma.dentalim.model.Patient;
import ma.dentalim.model.enums.Sexe;
import ma.dentalim.model.HistoriqueMedicale;
import ma.dentalim.model.SituationFinanciere;
import ma.dentalim.model.Consultation;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class PatientDAO {

    private static final File fileDBPath = new File("database/patients.txt");

    // Mapper un objet Patient en ligne de fichier
    private String mapToLine(Patient patient) {
        var id = patient.getId();
        var nom = patient.getNom();
        var prénom = patient.getPrénom();
        var email = patient.getEmail();
        var cin = patient.getCin();
        var sexe = patient.getSexe();
        var profession = patient.getProfession();
        var historiqueMedicale = patient.getHistoriqueMedicale() == null ? "null" : patient.getHistoriqueMedicale().toString();

        return id + "-" +
                (nom == null ? "null" : nom) + "-" +
                (prénom == null ? "null" : prénom) + "-" +
                (email == null ? "null" : email) + "-" +
                (cin == null ? "null" : cin) + "-" +
                (sexe == null ? "null" : sexe.toString()) + "-" +
                (profession == null ? "null" : profession) + "-" +
                historiqueMedicale;
    }

    // Mapper une ligne de fichier vers un objet Patient
    private Patient mapToPatient(String fileLine) throws IOException {
        StringTokenizer st = new StringTokenizer(fileLine, "-");
        Long id = Long.parseLong(st.nextToken());
        String nom = st.nextToken().equals("null") ? null : st.nextToken();
        String prénom = st.nextToken().equals("null") ? null : st.nextToken();
        String email = st.nextToken().equals("null") ? null : st.nextToken();
        String cin = st.nextToken().equals("null") ? null : st.nextToken();
        Sexe sexe = st.nextToken().equals("null") ? null : Sexe.valueOf(st.nextToken());
        String profession = st.nextToken().equals("null") ? null : st.nextToken();

        return new Patient(id, nom, prénom, email, cin, sexe, null, null, null, null, profession, new ArrayList<>());
    }

    // Trouver tous les patients
    public List<Patient> findAll() throws IOException {
        List<Patient> patients = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileDBPath))) {
            reader.lines().skip(1).forEach(line -> {
                try {
                    Patient patient = mapToPatient(line);
                    patients.add(patient);
                } catch (IOException e) {
                    System.err.println("Erreur de mapping : " + e.getMessage());
                }
            });
        }
        return patients;
    }


    public Patient findByCIN(String cin) throws IOException {
        return findAll().stream()
                .filter(patient -> cin.equals(patient.getCin()))
                .findFirst()
                .orElse(null);
    }


    public void save(Patient patient) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileDBPath, true))) {
            writer.write(mapToLine(patient));
            writer.newLine();
        }
    }


    public void update(Patient updatedPatient) throws IOException {
        List<Patient> patients = findAll();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileDBPath))) {
            for (Patient patient : patients) {
                if (patient.getId().equals(updatedPatient.getId())) {
                    writer.write(mapToLine(updatedPatient));
                } else {
                    writer.write(mapToLine(patient));
                }
                writer.newLine();
            }
        }
    }


    public void deleteById(Long id) throws IOException {
        List<Patient> patients = findAll();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileDBPath))) {
            for (Patient patient : patients) {
                if (!patient.getId().equals(id)) {
                    writer.write(mapToLine(patient));
                    writer.newLine();
                }
            }
        }
    }
}
