package kg.mega.samostoyatelnayarabota.controllers;

import kg.mega.samostoyatelnayarabota.model.dto.ExamDto;
import kg.mega.samostoyatelnayarabota.services.ExamService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("exam")
public class ExamControllers {
    private final ExamService examService;

    public ExamControllers(ExamService examService) {
        this.examService = examService;
    }

    @PostMapping("/create")
    public ExamDto save(@RequestBody ExamDto examDto){
        return examService.save(examDto);
    }
    @GetMapping("/read")
    public ExamDto read(@RequestBody ExamDto examDto){
        return examService.read(examDto);
    }
    @PutMapping("/update")
    public ExamDto update(@RequestBody ExamDto examDto){
        return examService.update(examDto);
    }
    @DeleteMapping("/delete")
    public ExamDto delete(@RequestBody ExamDto examDto){
        return examService.delete(examDto);
    }


}
