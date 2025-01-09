package ma.dentalim.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Charge extends BaseEntity {
    private String description;
    private Double montant;
    private LocalDate date;
}
