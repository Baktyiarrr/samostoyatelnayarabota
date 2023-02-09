package kg.mega.samostoyatelnayarabota.controllers;

import kg.mega.samostoyatelnayarabota.model.dto.ExamDto;
import kg.mega.samostoyatelnayarabota.model.dto.StudentDto;
import kg.mega.samostoyatelnayarabota.model.dto.SubjectDto;
import kg.mega.samostoyatelnayarabota.services.SubjectService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("subject")
public class SubjectControllers {
    private final SubjectService subjectService;

    public SubjectControllers(SubjectService subjectService) {
        this.subjectService = subjectService;
    }

    @PostMapping("/create")
    public SubjectDto create(@RequestBody SubjectDto subjectDto){
        return subjectService.create(subjectDto);
    }
    @GetMapping("/read")
    public SubjectDto read(@RequestBody SubjectDto  subjectDto){
        return subjectService.read(subjectDto);
    }
    @PutMapping("/update")
    public SubjectDto update(@RequestBody SubjectDto subjectDto){
        return subjectService.update(subjectDto);
    }
    @DeleteMapping("/delete")
    public SubjectDto delete(@RequestBody SubjectDto subjectDto){
        return subjectService.delete(subjectDto);
    }
}
