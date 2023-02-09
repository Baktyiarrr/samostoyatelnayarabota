package kg.mega.samostoyatelnayarabota.mappers.impl;

import kg.mega.samostoyatelnayarabota.mappers.TeacherMapper;
import kg.mega.samostoyatelnayarabota.model.dto.TeacherDto;
import kg.mega.samostoyatelnayarabota.model.entities.Teacher;
import org.springframework.stereotype.Service;

@Service
public class TeacherMapperImpl implements TeacherMapper {
    @Override
    public Teacher teacherDtoToTeacher(TeacherDto teacherDto) {
        Teacher teacher = new Teacher();
        teacher.setId(teacherDto.getId());
        teacher.setName(teacherDto.getName());
        teacher.setPatronymic(teacherDto.getPatronymic());
        teacher.setSubject(teacherDto.getSubject());
        return teacher;
    }
}
