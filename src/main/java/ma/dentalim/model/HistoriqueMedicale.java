package ma.dentalim.model;

import lombok.Data;
import ma.dentalim.model.enums.CategorieHistoriqueMedicale;

import java.util.List;

@Data
public class HistoriqueMedicale extends BaseEntity {
    private String libelle;
    private CategorieHistoriqueMedicale categorie;
    private List<Patient> patientsAvecHistoriqueMedicale;
}
