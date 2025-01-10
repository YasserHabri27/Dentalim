package ma.dentalim.model;

import lombok.Data;
import ma.dentalim.model.common.BaseEntity;

@Data
public class Revenue extends BaseEntity {
    private Long idRevenue;
    private String description;
    private Double montant;

    // Constructeur, getters et setters peuvent être générés automatiquement par Lombok (@Data)
}
