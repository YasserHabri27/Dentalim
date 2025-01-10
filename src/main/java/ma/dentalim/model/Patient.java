package ma.dentalim.model;

import lombok.Data;
import ma.dentalim.model.enums.GroupeSanguin;
import ma.dentalim.model.enums.Mutuelle;
import ma.dentalim.model.enums.Sexe;

import java.time.LocalDate;
import java.util.List;

@Data
public class Patient extends Personne {
    private Long id;
    private String nom;
    private String prénom;
    private String email;
    private String cin;
    private Sexe sexe;

    private GroupeSanguin groupeSanguin;
    private LocalDate dateNaissance;
    private Mutuelle mutuelle;
    private DossierMedicale dossierMedicale;
    private String profession;
    private List<HistoriqueMedicale> historiqueMedicale;


    public Patient(Long id, String nom, String prénom, String email, String cin, Sexe sexe, GroupeSanguin groupeSanguin,
                   LocalDate dateNaissance, Mutuelle mutuelle, DossierMedicale dossierMedicale, String profession,
                   List<HistoriqueMedicale> historiqueMedicale) {
        this.id = id;
        this.nom = nom;
        this.prénom = prénom;
        this.email = email;
        this.cin = cin;
        this.sexe = sexe;
        this.groupeSanguin = groupeSanguin;
        this.dateNaissance = dateNaissance;
        this.mutuelle = mutuelle;
        this.dossierMedicale = dossierMedicale;
        this.profession = profession;
        this.historiqueMedicale = historiqueMedicale;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prénom='" + prénom + '\'' +
                ", email='" + email + '\'' +
                ", cin='" + cin + '\'' +
                ", sexe=" + sexe +
                ", groupeSanguin=" + groupeSanguin +
                ", dateNaissance=" + dateNaissance +
                ", mutuelle=" + mutuelle +
                ", dossierMedicale=" + dossierMedicale +
                ", profession='" + profession + '\'' +
                ", historiqueMedicale=" + historiqueMedicale +
                '}';
    }
}

