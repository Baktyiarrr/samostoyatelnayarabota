package kg.mega.samostoyatelnayarabota.services;

import kg.mega.samostoyatelnayarabota.model.dto.ExamDto;
import kg.mega.samostoyatelnayarabota.model.dto.StudentDto;
import kg.mega.samostoyatelnayarabota.model.dto.StudentDtoInter;

import java.util.List;

public interface StudentService {
    StudentDto save(StudentDto studentDto);

    ExamDto read(StudentDto studentDto);

    ExamDto update(StudentDto studentDto);

    ExamDto delete(StudentDto studentDto);
    List<StudentDtoInter> findByName(String name);//для интереса создал
}
