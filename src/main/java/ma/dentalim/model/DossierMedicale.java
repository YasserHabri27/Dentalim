package ma.dentalim.model;

import ma.dentalim.model.Consultation;
import ma.dentalim.model.SituationFinanciere;

import java.util.List;

public class DossierMedicale {

    private Long id;
    private String docteurTraitant;
    private Patient patient;
    private List<HistoriqueMedicale> historiqueMedicale;
    private SituationFinanciere situationFinanciere;
    private List<Consultation> consultations;

    public DossierMedicale(Long id, String docteurTraitant, Patient patient, List<HistoriqueMedicale> historiqueMedicale,
                          SituationFinanciere situationFinanciere, List<Consultation> consultations) {
        this.id = id;
        this.docteurTraitant = docteurTraitant;
        this.patient = patient;
        this.historiqueMedicale = historiqueMedicale;
        this.situationFinanciere = situationFinanciere;
        this.consultations = consultations;
    }

    @Override
    public String toString() {
        return "DossierPatient{" +
                "id=" + id +
                ", docteurTraitant='" + docteurTraitant + '\'' +
                ", patient=" + patient +
                ", historiqueMedicale=" + historiqueMedicale +
                ", situationFinanciere=" + situationFinanciere +
                ", consultations=" + consultations +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDocteurTraitant() {
        return docteurTraitant;
    }

    public void setDocteurTraitant(String docteurTraitant) {
        this.docteurTraitant = docteurTraitant;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public List<HistoriqueMedicale> getHistoriqueMedicale() {
        return historiqueMedicale;
    }

    public void setHistoriqueMedicale(List<HistoriqueMedicale> historiqueMedicale) {
        this.historiqueMedicale = historiqueMedicale;
    }

    public SituationFinanciere getSituationFinanciere() {
        return situationFinanciere;
    }

    public void setSituationFinanciere(SituationFinanciere situationFinanciere) {
        this.situationFinanciere = situationFinanciere;
    }

    public List<Consultation> getConsultations() {
        return consultations;
    }

    public void setConsultations(List<Consultation> consultations) {
        this.consultations = consultations;
    }
}

