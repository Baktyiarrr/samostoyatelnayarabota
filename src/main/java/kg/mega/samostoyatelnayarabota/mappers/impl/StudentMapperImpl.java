package kg.mega.samostoyatelnayarabota.mappers.impl;

import kg.mega.samostoyatelnayarabota.mappers.StudentMapper;
import kg.mega.samostoyatelnayarabota.model.dto.StudentDto;
import kg.mega.samostoyatelnayarabota.model.entities.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentMapperImpl implements StudentMapper {
    @Override
    public Student studentDtoToStudent(StudentDto studentDto) {
        Student student = new Student();
        student.setId(studentDto.getId());
        student.setName(studentDto.getName());
        student.setLastName(studentDto.getLastName());
        student.setPatronymic(studentDto.getPatronymic());
        student.setActive(studentDto.getSubject().isActive());
        student.setSchoolarship(studentDto.getSchoolarship());
        student.setSubject(studentDto.getSubject());

        return student;
    }
}
