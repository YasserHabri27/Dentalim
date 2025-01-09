package ma.dentalim.model;

import lombok.Data;
import ma.dentalim.model.enums.Disponibilite;
import ma.dentalim.model.enums.StatusEmploye;

import java.time.LocalDate;
import java.util.Map;
import java.time.DayOfWeek;

@Data
public class Staff extends Personne {
    private Double salaireDeBase;
    private StatusEmploye statusActuel;
    private Map<DayOfWeek, Disponibilite> disponibilite;
    private LocalDate dateRetourConge;
    private Cabinet cabinetDeTravail;

    public void prendreConge(LocalDate dateRetour, StatusEmploye status) {
        this.dateRetourConge = dateRetour;
        this.statusActuel = status;
    }

    public void revenirTravailler() {
        this.statusActuel = StatusEmploye.Actif;
    }
}
