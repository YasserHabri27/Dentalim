package ma.dentalim.model;

import lombok.Data;
import ma.dentalim.model.common.BaseEntity;
import ma.dentalim.model.enums.TypeRDV;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
public class RendezVous extends BaseEntity {
    private LocalDate dateRdv;
    private LocalTime temps;
    private TypeRDV typeRDV;
    private DossierMedicale dossierMedicale;
    private Consultation consultation;
    private String modif;
}
