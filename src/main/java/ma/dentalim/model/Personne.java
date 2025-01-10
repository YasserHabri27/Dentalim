package ma.dentalim.model;

import lombok.Data;
import ma.dentalim.model.common.BaseEntity;

import java.time.LocalDate;

@Data
public abstract class Personne extends BaseEntity {
    private String prenom;
    private String nom;
    private String cin;
    private String sexe;
    private LocalDate dateDeNaissance;
    private String adresse;
    private String telephone;
    private String email;
    private String photoDeProfil;
}
