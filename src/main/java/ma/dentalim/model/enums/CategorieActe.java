package ma.dentalim.model.enums;

public enum CategorieActe {
    PREVENTION("Prévention"),
    PROTHESES_DENTAIRES("Prothèses Dentaires"),
    ORTHODONTIE("Orthodontie"),
    IMPLANTOLOGIE("Implantologie"),
    CHIRURGIE("Chirurgie"),
    SOINS_DES_TISSU_MOUS("Soins des Tissus Mous"),
    SOINS_DES_CARIES("Soins des Caries"),
    DIAGNOSTIC("Diagnostic");

    private final String libelle;


    CategorieActe(String libelle) {
        this.libelle = libelle;
    }

    public String getLibelle() {
        return libelle;
    }
}
