package kg.mega.samostoyatelnayarabota.repositories;

import kg.mega.samostoyatelnayarabota.model.entities.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepo  extends JpaRepository<Teacher, Long> {
}
