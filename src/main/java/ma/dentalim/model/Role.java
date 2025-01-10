package ma.dentalim.model;

import lombok.Data;
import ma.dentalim.model.common.BaseEntity;

import java.util.List;

@Data
public class Role extends BaseEntity {
    private String nomRole;
    private List<String> privileges;

    public void ajouterPrivilege(String privilege) {
        this.privileges.add(privilege);
    }

    public void supprimerPrivilege(String privilege) {
        this.privileges.remove(privilege);
    }
}
