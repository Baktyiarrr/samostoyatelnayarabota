package kg.mega.samostoyatelnayarabota.repositories;

import kg.mega.samostoyatelnayarabota.model.entities.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRepo extends JpaRepository<Subject, Long> {
}
