package kg.mega.samostoyatelnayarabota.controllers;

import kg.mega.samostoyatelnayarabota.model.dto.SubjectDto;
import kg.mega.samostoyatelnayarabota.model.dto.TeacherDto;
import kg.mega.samostoyatelnayarabota.services.TeacherService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("teacher")
public class TeacherControllers {
    private final TeacherService teacherService;

    public TeacherControllers(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @PostMapping("/create")
    public TeacherDto create(@RequestBody TeacherDto teacherDto){
        return teacherService.create(teacherDto);
    }
    @GetMapping("/read")
    public TeacherDto read(@RequestBody TeacherDto  teacherDto){
        return teacherService.read(teacherDto);
    }
    @PutMapping("/update")
    public TeacherDto update(@RequestBody TeacherDto teacherDto){
        return teacherService.update(teacherDto);
    }
    @DeleteMapping("/delete")
    public TeacherDto delete(@RequestBody TeacherDto teacherDto){
        return teacherService.delete(teacherDto);
    }

}
