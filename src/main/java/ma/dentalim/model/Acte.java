package ma.dentalim.model;

import lombok.Data;
import ma.dentalim.model.enums.CategorieActe;

import java.util.List;

@Data
public class Acte extends BaseEntity {
    private Long idActe;
    private String libele;
    private Double prixDeBase;
    private CategorieActe categorie;
    private List<InterventionMedecin> interventions;

    // Méthodes supplémentaires peuvent être ajoutées si nécessaire.
}
