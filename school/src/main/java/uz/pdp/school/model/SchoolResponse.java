package uz.pdp.school.model;

import lombok.*;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SchoolResponse {
    private Integer id;

    private String name;

    private String email;

    private List<Student> studentList;
}
