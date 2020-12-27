package model.staff;

import lombok.*;

import java.time.LocalDate;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class Employee extends Human {

    private int salary;
    private int workExperience;

    @Builder(builderMethodName = "EmployeeBuilder")
    public Employee(String name, String surname, LocalDate birthdate,
                    int salary, int workExperience) {
        super(name, surname, birthdate);
        this.salary = salary;
        this.workExperience = workExperience;
    }
}