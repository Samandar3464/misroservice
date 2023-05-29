package uz.pdp.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.student.entity.Student;

import java.util.List;

public interface StudentRepo extends JpaRepository<Student, Integer> {

    List<Student> findAllBySchoolId(Integer schoolId);
}
