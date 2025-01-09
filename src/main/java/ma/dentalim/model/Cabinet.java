package ma.dentalim.model;

import lombok.Data;

import java.util.List;

@Data
public class Cabinet extends BaseEntity {
    private String nom;
    private String logo;
    private String email;
    private String adresse;
    private String telephone1;
    private String telephone2;
    private List<Staff> staff;
    private Caisse caisse;
}
