package ma.dentalim.model;

import lombok.Data;
import ma.dentalim.model.common.BaseEntity;

@Data
public class PrescriptionDeMedicament extends BaseEntity {
    private Medicament medicamentAPrescrire;
    private Ordonnance ordonnance;
    private int unitesMinAPrendre;
    private int unitesMaxAPrendre;
    private String contraintesTemps;
    private String contraintesAlimentation;
}
