package kg.mega.samostoyatelnayarabota.mappers;

import kg.mega.samostoyatelnayarabota.model.dto.StudentDto;
import kg.mega.samostoyatelnayarabota.model.entities.Student;
import org.springframework.stereotype.Repository;


public interface StudentMapper {
    Student studentDtoToStudent(StudentDto studentDto);
}
