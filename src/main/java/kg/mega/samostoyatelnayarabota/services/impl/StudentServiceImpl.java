package kg.mega.samostoyatelnayarabota.services.impl;

import kg.mega.samostoyatelnayarabota.mappers.StudentMapper;
import kg.mega.samostoyatelnayarabota.model.dto.ExamDto;
import kg.mega.samostoyatelnayarabota.model.dto.StudentDto;
import kg.mega.samostoyatelnayarabota.model.dto.StudentDtoInter;
import kg.mega.samostoyatelnayarabota.model.entities.Student;
import kg.mega.samostoyatelnayarabota.repositories.StudentRepo;
import kg.mega.samostoyatelnayarabota.services.StudentService;
import kg.mega.samostoyatelnayarabota.services.SubjectService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    private final StudentRepo studentRepo;
    private final StudentMapper studentMapper;
    private final SubjectService subjectService;

    public StudentServiceImpl(StudentRepo studentRepo, StudentMapper studentMapper, SubjectService subjectService) {
        this.studentRepo = studentRepo;
        this.studentMapper = studentMapper;
        this.subjectService = subjectService;
    }

    @Override
    public List<StudentDtoInter> findByName(String name) {
        return studentRepo.findByName(name);
    }

    @Override
    public StudentDto save(StudentDto studentDto) {
        Student student =  studentMapper.studentDtoToStudent(studentDto);
        student = studentRepo.save(student);
        studentDto.setId(student.getId());

        //subjectService.save(studentDto.getSubject().isActive(),subjectDto.getName());// subjectDto must create
        return studentDto;

    }

    @Override
    public ExamDto read(StudentDto studentDto) {
        return null;
    }

    @Override
    public ExamDto update(StudentDto studentDto) {
        return null;
    }

    @Override
    public ExamDto delete(StudentDto studentDto) {
        return null;
    }
}
