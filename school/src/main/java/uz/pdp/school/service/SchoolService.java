package uz.pdp.school.service;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import uz.pdp.school.client.StudentClient;
import uz.pdp.school.entity.School;
import uz.pdp.school.model.SchoolResponse;
import uz.pdp.school.repository.SchoolRepo;

@Service
@RequiredArgsConstructor
public class SchoolService {

    private final SchoolRepo schoolRepo;
    private  final StudentClient studentClient;

    public HttpEntity<?> getAll() {
        return ResponseEntity.ok().body(schoolRepo.findAll());
    }

    public HttpEntity<?> save(School school) {
        schoolRepo.save(school);
        return ResponseEntity.ok().build();
    }

    public HttpEntity<?> getAllStudents(Integer id) {
        var school = schoolRepo.findById(id).orElse(School.builder().name("NULL").email("NULL").build());
        var students = studentClient.getAllSchools(id);
        SchoolResponse build = SchoolResponse.builder()
                .name(school.getName())
                .email(school.getEmail())
                .studentList(students)
                .build();
        return ResponseEntity.ok().body(build);
    }
}
