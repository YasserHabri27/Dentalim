package ma.dentalim.model;

import lombok.Data;
import ma.dentalim.model.enums.Specialite;

@Data
public class Dentiste extends Staff {
    private Specialite specialite;
}
