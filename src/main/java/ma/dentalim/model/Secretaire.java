package ma.dentalim.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Secretaire extends Staff {
    private double prime;
}
