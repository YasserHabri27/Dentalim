package ma.dentalim.model;

import lombok.Data;
import ma.dentalim.model.common.BaseEntity;

import java.time.LocalDate;
import java.util.List;

@Data
public class SituationFinanciere extends BaseEntity {
    private Long idSituationFinanciere;
    private Double montantGlobalePaye;
    private Double montantGlobaleRestant;
    private LocalDate dateCreation;
    private DossierMedicale dossierMedicale;
    private List<Facture> factures;

    // Méthodes supplémentaires pour les calculs ou mises à jour peuvent être ajoutées si nécessaire.
}
