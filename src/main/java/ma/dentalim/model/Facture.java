package ma.dentalim.model;

import lombok.Data;
import ma.dentalim.model.common.BaseEntity;
import ma.dentalim.model.enums.TypePaiement;

import java.time.LocalDate;

@Data
public class Facture extends BaseEntity {
    private Double montantTotal;
    private Double montantPaye;
    private Double montantRestant;
    private TypePaiement typePaiement;
    private Consultation consultation;
    private SituationFinanciere situationFinanciere;
    private LocalDate dateFacturation;

    public void calculerMontantRestant() {
        this.montantRestant = this.montantTotal - this.montantPaye;
    }
}
