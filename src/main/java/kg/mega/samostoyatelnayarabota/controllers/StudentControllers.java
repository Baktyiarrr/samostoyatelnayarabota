package kg.mega.samostoyatelnayarabota.controllers;

import kg.mega.samostoyatelnayarabota.model.dto.ExamDto;
import kg.mega.samostoyatelnayarabota.model.dto.StudentDto;
import kg.mega.samostoyatelnayarabota.model.dto.StudentDtoInter;
import kg.mega.samostoyatelnayarabota.services.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentControllers {
    private final StudentService studentService;

    public StudentControllers(StudentService studentService) {
        this.studentService = studentService;
    }


    @PostMapping("/create")
    public StudentDto save(@RequestBody StudentDto studentDto){
        return studentService.save(studentDto);
    }
    @GetMapping("/read")
    public ExamDto read(@RequestBody StudentDto  studentDto){
        return studentService.read(studentDto);
    }
    @PutMapping("/update")
    public ExamDto update(@RequestBody StudentDto studentDto){
        return studentService.update(studentDto);
    }
    @DeleteMapping("/delete")
    public ExamDto delete(@RequestBody StudentDto studentDto){
        return studentService.delete(studentDto);
    }


    @GetMapping("/run")
    List<StudentDtoInter> findByName(@RequestParam String name){
        return studentService.findByName(name);
    }




    /*private final StudentServiceController studentServiceController;


    public StudentControllers(StudentServiceController studentServiceController) {
        this.studentServiceController = studentServiceController;
    }

    @GetMapping("/run/{taskNum}")
    public Object run(@PathVariable int taskNum){
        return studentServiceController.run(taskNum);
    }*/
}
