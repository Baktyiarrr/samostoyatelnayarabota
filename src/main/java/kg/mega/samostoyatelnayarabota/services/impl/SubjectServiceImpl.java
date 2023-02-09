package kg.mega.samostoyatelnayarabota.services.impl;

import kg.mega.samostoyatelnayarabota.mappers.SubjectMapper;
import kg.mega.samostoyatelnayarabota.model.dto.SubjectDto;
import kg.mega.samostoyatelnayarabota.model.entities.Subject;
import kg.mega.samostoyatelnayarabota.repositories.SubjectRepo;
import kg.mega.samostoyatelnayarabota.services.SubjectService;
import org.springframework.stereotype.Service;

@Service
public class SubjectServiceImpl implements SubjectService {
    private final SubjectMapper subjectMapper;
    private final SubjectRepo subjectRepo;

    public SubjectServiceImpl(SubjectMapper subjectMapper, SubjectRepo subjectRepo) {
        this.subjectMapper = subjectMapper;
        this.subjectRepo = subjectRepo;
    }

    @Override
    public SubjectDto delete(SubjectDto subjectDto) {
        return null;
    }

    @Override
    public SubjectDto update(SubjectDto subjectDto) {
        return null;
    }

    @Override
    public SubjectDto read(SubjectDto subjectDto) {
        return null;
    }

    @Override
    public SubjectDto create(SubjectDto subjectDto) {
        return null;
    }
}
