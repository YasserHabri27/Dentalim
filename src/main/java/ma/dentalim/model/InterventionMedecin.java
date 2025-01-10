package ma.dentalim.model;

import lombok.Data;
import ma.dentalim.model.common.BaseEntity;

@Data
public class InterventionMedecin extends BaseEntity {
    private Acte acte;
    private String noteMedecin;
    private Long dent;
    private Double prixPatient;
    private Consultation consultation;
}
