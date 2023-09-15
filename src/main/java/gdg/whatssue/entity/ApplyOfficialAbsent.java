package gdg.whatssue.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ApplyOfficialAbsent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long applyOfficialAbsentId;
    private String absentReason;
    private LocalDate absentDate;
    private String absentIsAccepted;

    @OneToOne
    @JoinColumn(name = "schedule_id")
    private Schedule schedule;

    public void saveSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public void AcceptAbsent(String absentIsAccepted) {
        this.absentIsAccepted = absentIsAccepted;
    }
}