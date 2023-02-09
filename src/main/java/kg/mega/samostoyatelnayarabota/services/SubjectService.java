package kg.mega.samostoyatelnayarabota.services;

import kg.mega.samostoyatelnayarabota.model.dto.StudentDto;
import kg.mega.samostoyatelnayarabota.model.dto.SubjectDto;
import kg.mega.samostoyatelnayarabota.model.entities.Subject;
import org.springframework.stereotype.Service;

public interface SubjectService {

    SubjectDto delete(SubjectDto subjectDto);

    SubjectDto update(SubjectDto subjectDto);

    SubjectDto read(SubjectDto subjectDto);

    SubjectDto create(SubjectDto subjectDto);
}
