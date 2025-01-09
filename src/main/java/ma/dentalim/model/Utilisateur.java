package ma.dentalim.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import ma.dentalim.model.enums.ERole;

import java.time.LocalDate;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
public class Utilisateur extends Personne {
    private String nomUtilisateur;
    private String motDePasse;
    private LocalDate dateDeCreation;
    private LocalDate dateDerniereConnexion;
    private LocalDate dateDeModification;
    private List<Role> roles;

    public void ajouteRole(Role role) {
        roles.add(role);
    }

    public boolean aPrivillege(String privilege) {
        return roles.stream().anyMatch(role -> role.getPrivileges().contains(privilege));
    }
}
