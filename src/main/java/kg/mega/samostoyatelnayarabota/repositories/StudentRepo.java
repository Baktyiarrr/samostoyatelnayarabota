package kg.mega.samostoyatelnayarabota.repositories;

import kg.mega.samostoyatelnayarabota.model.dto.StudentDtoInter;
import kg.mega.samostoyatelnayarabota.model.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface StudentRepo extends JpaRepository<Student, Long> {
    @Query(value = "Select * from students " +
            "where name = :name ",nativeQuery = true)
    List<StudentDtoInter> findByName(String name);



}


