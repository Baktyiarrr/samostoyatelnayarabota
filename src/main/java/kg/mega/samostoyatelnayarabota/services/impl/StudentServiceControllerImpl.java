package kg.mega.samostoyatelnayarabota.services.impl;

import kg.mega.samostoyatelnayarabota.services.StudentService;
import kg.mega.samostoyatelnayarabota.services.StudentServiceController;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceControllerImpl implements StudentServiceController {
    private final StudentService studentService;

    public StudentServiceControllerImpl(StudentService studentService) {
        this.studentService = studentService;
    }

    @Override
    public Object run(int taskNum) {
        switch (taskNum){
            case 1:
                return studentService.findByName("Baktyiar");
        }
        return null;
    }
}
