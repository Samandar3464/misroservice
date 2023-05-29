package uz.pdp.school.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.*;
import uz.pdp.school.entity.School;
import uz.pdp.school.service.SchoolService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/school")
public class SchoolController {

    private final SchoolService service;

    @GetMapping("/all")
    public HttpEntity<?> getAllSchools(){
        return service.getAll();
    }

    @PostMapping("/add")
    public HttpEntity<?> saveSchool(@RequestBody School school){
        return service.save(school);
    }

    @GetMapping("/allStudents/{id}")
    public HttpEntity<?> getAllStudents(@PathVariable Integer id) {
        return service.getAllStudents(id);
    }

}
