package ma.dentalim.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public abstract class BaseEntity {
    private Long id;
    private LocalDate dateDeCreation;
    private LocalDate dateDeModification;


    public BaseEntity() {
        this.dateDeCreation = LocalDate.now();
        this.dateDeModification = LocalDate.now();
    }


    public void mettreAJour() {
        this.dateDeModification = LocalDate.now();
    }
}
