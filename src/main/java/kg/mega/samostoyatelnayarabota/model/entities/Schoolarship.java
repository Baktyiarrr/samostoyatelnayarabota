package kg.mega.samostoyatelnayarabota.model.entities;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Data
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "schoolarships")
public class Schoolarship {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    int howMuch;
    Date startDate;
    Date endDate;
}
