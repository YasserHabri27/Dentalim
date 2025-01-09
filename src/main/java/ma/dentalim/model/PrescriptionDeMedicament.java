package ma.dentalim.model;

import lombok.Data;

@Data
public class PrescriptionDeMedicament extends BaseEntity {
    private Medicament medicamentAPrescrire;
    private Ordonnance ordonnance;
    private int unitesMinAPrendre;
    private int unitesMaxAPrendre;
    private String contraintesTemps;
    private String contraintesAlimentation;
}
