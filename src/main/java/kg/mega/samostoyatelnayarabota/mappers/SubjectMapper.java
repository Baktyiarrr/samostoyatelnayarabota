package kg.mega.samostoyatelnayarabota.mappers;

import kg.mega.samostoyatelnayarabota.model.dto.StudentDto;
import kg.mega.samostoyatelnayarabota.model.dto.SubjectDto;
import kg.mega.samostoyatelnayarabota.model.entities.Student;
import kg.mega.samostoyatelnayarabota.model.entities.Subject;

public interface SubjectMapper {
    Subject subjectDtoToSubject(SubjectDto subjectDto);
}
