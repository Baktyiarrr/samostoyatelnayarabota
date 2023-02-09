package kg.mega.samostoyatelnayarabota.model.entities;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String lastName;
    String name;
    String patronymic;
    boolean isActive;
    String Address;
    @ManyToOne
    Subject subject;
    @ManyToOne
    Schoolarship schoolarship;
}
