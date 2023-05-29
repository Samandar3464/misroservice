package uz.pdp.school.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {

    private Integer id;

    private String name;
    private int age;
    private String email;
    private Integer schoolId;
}
