package ma.dentalim.model;

import lombok.Data;

import java.util.List;

@Data
public class Caisse extends BaseEntity {
    private Double recetteDuJour;
    private Double recetteDuMois;
    private Double recetteDeLannee;
    private List<SituationFinanciere> situationFinancieres;
    private Cabinet cabinet;
}
