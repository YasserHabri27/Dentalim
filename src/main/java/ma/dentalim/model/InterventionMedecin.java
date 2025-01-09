package ma.dentalim.model;

import lombok.Data;

@Data
public class InterventionMedecin extends BaseEntity {
    private Acte acte;
    private String noteMedecin;
    private Long dent;
    private Double prixPatient;
    private Consultation consultation;
}
