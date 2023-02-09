package kg.mega.samostoyatelnayarabota.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Id;
import kg.mega.samostoyatelnayarabota.model.entities.Schoolarship;
import kg.mega.samostoyatelnayarabota.model.entities.Subject;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class StudentDto {

    @Id
    Long id;
    String name;
    @JsonProperty("last_name")
    String lastName;
    String patronymic;
    @JsonProperty("is_active")
    boolean isActive;
    Schoolarship schoolarship;
    Subject subject;
}
