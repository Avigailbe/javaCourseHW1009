package home_work1009;

import lombok.*;

@Data
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@With
@Builder
public class Employee {
    private String name;
    private String address;
    private int age;
    private String gender;
}
