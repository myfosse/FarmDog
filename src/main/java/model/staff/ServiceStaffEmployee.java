package model.staff;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import model.area.Aviary;
import model.work.DoOwnWork;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class ServiceStaffEmployee extends Employee implements DoOwnWork {

    private Set<Aviary> aviaryToService = new HashSet<>();

    @Builder(builderMethodName = "ServiceStaffEmployeeBuilder")
    public ServiceStaffEmployee(String name, String surname, LocalDate birthdate,
                                int salary, int workExperience,
                                Set<Aviary> aviaryToService) {
        super(name, surname, birthdate, salary, workExperience);
        this.aviaryToService = aviaryToService;
    }

    @Override
    public void work() {
        System.out.println("Start work");
        aviaryToService.forEach(aviary -> System.out.println("Cleaning " + aviary.toString()));
    }

    @Override
    public void finishWork() {
        System.out.println("Finish work");
    }
}