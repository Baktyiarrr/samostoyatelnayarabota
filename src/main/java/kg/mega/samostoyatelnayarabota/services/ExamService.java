package kg.mega.samostoyatelnayarabota.services;

import kg.mega.samostoyatelnayarabota.model.dto.ExamDto;
import kg.mega.samostoyatelnayarabota.model.dto.StudentDto;
import kg.mega.samostoyatelnayarabota.model.entities.Exam;
import kg.mega.samostoyatelnayarabota.model.entities.Student;

public interface ExamService {
    Exam examDtoToExam(ExamDto examDto);

    ExamDto save(ExamDto examDto);

    ExamDto update(ExamDto examDto);

    ExamDto read(ExamDto examDto);

    ExamDto delete(ExamDto examDto);
}
