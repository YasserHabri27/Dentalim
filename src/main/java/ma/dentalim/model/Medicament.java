package ma.dentalim.model;

import lombok.Data;

import java.util.List;

@Data
public class Medicament extends BaseEntity {
    private String nom;
    private String description;
    private Double prix;
    private List<PrescriptionDeMedicament> prescriptionDeCeMedicaments;
    private List<HistoriqueMedicale> precautionsEnCasDe;
}