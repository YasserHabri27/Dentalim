package ma.dentalim.model;

import lombok.Data;
import ma.dentalim.model.common.BaseEntity;
import ma.dentalim.model.enums.TypeConsultation;

import java.time.LocalDate;
import java.util.List;

@Data
public class Consultation extends BaseEntity {
    private TypeConsultation typeConsultation;
    private LocalDate dateConsultation;
    private DossierMedicale dossierMedicale;
    private Ordonnance ordonnance;
    private List<InterventionMedecin> interventions;
    private List<Facture> factures;
}
