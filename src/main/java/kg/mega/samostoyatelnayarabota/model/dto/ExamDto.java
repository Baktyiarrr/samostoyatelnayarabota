package kg.mega.samostoyatelnayarabota.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import kg.mega.samostoyatelnayarabota.model.entities.Subject;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ExamDto {
    @Id
    Long id;
    int score;
    Date delivaryDate;
    Date duration;
    @JsonProperty("subjects")
    Subject subject;
}
