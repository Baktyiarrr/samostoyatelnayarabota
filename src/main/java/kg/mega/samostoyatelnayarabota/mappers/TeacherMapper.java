package kg.mega.samostoyatelnayarabota.mappers;

import kg.mega.samostoyatelnayarabota.model.dto.TeacherDto;
import kg.mega.samostoyatelnayarabota.model.entities.Teacher;

public interface TeacherMapper {
    Teacher teacherDtoToTeacher(TeacherDto teacherDto);
}
