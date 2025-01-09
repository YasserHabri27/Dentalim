package ma.dentalim.model;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class Ordonnance extends BaseEntity {
    private LocalDate date;
    private Consultation consultationConcernee;
    private List<PrescriptionDeMedicament> prescriptionDeMedicaments;
}
