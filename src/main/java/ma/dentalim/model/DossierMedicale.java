package ma.dentalim.model;

import lombok.Data;

import java.util.List;

@Data
public class DossierMedicale extends BaseEntity {
    private Patient patient;
    private List<HistoriqueMedicale> historiqueMedicale;
    private SituationFinanciere situationFinanciere;
    private List<Consultation> consultations;
}
