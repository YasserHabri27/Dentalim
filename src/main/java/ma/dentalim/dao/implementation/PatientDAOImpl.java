package ma.dentalim.dao.implementation;

import ma.dentalim.dao.interfaces.IDAO;
import ma.dentalim.model.Patient;

import java.util.ArrayList;
import java.util.List;

public class PatientDAOImpl implements IDAO<Patient, Long> {
    private List<Patient> patients = new ArrayList<>();

    @Override
    public Patient save(Patient patient) {
        patients.add(patient);
        return patient;
    }

    @Override
    public Patient findById(Long id) {
        return patients.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public List<Patient> findAll() {
        return new ArrayList<>(patients);
    }

    @Override
    public void deleteById(Long id) {
        patients.removeIf(p -> p.getId().equals(id));
    }
}
