package kg.mega.samostoyatelnayarabota.mappers;

import kg.mega.samostoyatelnayarabota.model.dto.ExamDto;
import kg.mega.samostoyatelnayarabota.model.dto.StudentDto;
import kg.mega.samostoyatelnayarabota.model.entities.Exam;
import kg.mega.samostoyatelnayarabota.model.entities.Student;

public interface ExamMapper {
    Exam examDtoToExam(ExamDto examDto);
}
