package uz.pdp.student.service;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import uz.pdp.student.entity.Student;
import uz.pdp.student.repository.StudentRepo;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepo studentRepo;

    public HttpEntity<?> getAll() {
        return ResponseEntity.ok().body(studentRepo.findAll());
    }

    public List<Student> getAll(Integer id) {
        return studentRepo.findAllBySchoolId(id);
    }

    public HttpEntity<?> save(Student student) {
       studentRepo.save(student);
       return ResponseEntity.ok().build();
    }

}
