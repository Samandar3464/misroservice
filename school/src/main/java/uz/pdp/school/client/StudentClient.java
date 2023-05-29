package uz.pdp.school.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import uz.pdp.school.model.Student;


import java.util.List;
@FeignClient(name = "student-service" , url = "${application.config.student-url}")
public interface StudentClient {

    @GetMapping("/allStudents/{id}")
     List<Student> getAllSchools(@PathVariable("id") Integer id);

}
