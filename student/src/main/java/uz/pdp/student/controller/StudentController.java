package uz.pdp.student.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import uz.pdp.student.entity.Student;
import uz.pdp.student.service.StudentService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/student")
public class StudentController {

    private final StudentService service;

    @GetMapping("/all")
    public HttpEntity<?> getAllSchools() {
        return service.getAll();
    }

    @GetMapping("/allStudents/{id}")
    public List<Student> getAllSchools(@PathVariable("id") Integer id) {
        return service.getAll(id);
    }

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public HttpEntity<?> saveStudent(@RequestBody Student student) {
        return service.save(student);
    }

}
