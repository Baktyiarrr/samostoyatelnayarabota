package kg.mega.samostoyatelnayarabota.mappers.impl;

import kg.mega.samostoyatelnayarabota.mappers.SubjectMapper;
import kg.mega.samostoyatelnayarabota.model.dto.SubjectDto;
import kg.mega.samostoyatelnayarabota.model.entities.Subject;
import org.springframework.stereotype.Service;

@Service
public class SubjectMapperImpl implements SubjectMapper {
    @Override
    public Subject subjectDtoToSubject(SubjectDto subjectDto) {
        Subject subject = new Subject();
        subject.setId(subjectDto.getId());
        subject.setName(subjectDto.getName());
        subject.setActive(subjectDto.isActive());

        return subject;
    }
}
