package kg.mega.samostoyatelnayarabota.services;

import kg.mega.samostoyatelnayarabota.model.dto.TeacherDto;

public interface TeacherService {
    TeacherDto create(TeacherDto teacherDto);

    TeacherDto read(TeacherDto teacherDto);

    TeacherDto update(TeacherDto teacherDto);

    TeacherDto delete(TeacherDto teacherDto);
}
