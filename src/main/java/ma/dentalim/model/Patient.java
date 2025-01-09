package ma.dentalim.model;

import lombok.Data;
import ma.dentalim.model.enums.GroupeSanguin;
import ma.dentalim.model.enums.Mutuelle;

import java.time.LocalDate;
import java.util.List;

@Data
public class Patient extends Personne {
    private GroupeSanguin groupeSanguin;
    private LocalDate dateNaissance;
    private Mutuelle mutuelle;
    private DossierMedicale dossierMedicale;
    private String profession;
    private List<HistoriqueMedicale> historiqueMedicale;
}
