package kg.mega.samostoyatelnayarabota.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import kg.mega.samostoyatelnayarabota.model.entities.Subject;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TeacherDto {
    @Id
    Long id;
    @JsonProperty("last_name")
    String lastName;
    String name;
    String patronymic;
    @JsonProperty("subjects")
    Subject subject;
}
