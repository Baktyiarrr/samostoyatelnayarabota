package kg.mega.samostoyatelnayarabota.mappers.impl;

import kg.mega.samostoyatelnayarabota.mappers.ExamMapper;
import kg.mega.samostoyatelnayarabota.model.dto.ExamDto;
import kg.mega.samostoyatelnayarabota.model.entities.Exam;
import org.springframework.stereotype.Service;

@Service
public class ExamMapperImpl implements ExamMapper {
    @Override
    public Exam examDtoToExam(ExamDto examDto) {
        Exam exam = new Exam();
        exam.setId(examDto.getId());
        exam.setDuration(examDto.getDuration());
        exam.setSubject(examDto.getSubject());
        exam.setScore(examDto.getScore());
        exam.setDelivaryDate(examDto.getDelivaryDate());
        return exam;
    }
}
