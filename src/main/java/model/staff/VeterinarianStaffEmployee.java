package model.staff;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import model.animal.Animal;
import model.work.DoOwnWork;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class VeterinarianStaffEmployee extends Employee implements DoOwnWork {

    private Set<Animal> observedAnimals = new HashSet<>();

    @Builder(builderMethodName = "VeterinarianStaffEmployeeBuilder")
    public VeterinarianStaffEmployee(String name, String surname, LocalDate birthdate,
                                     int salary, int workExperience,
                                     Set<Animal> observedAnimals) {
        super(name, surname, birthdate, salary, workExperience);
        this.observedAnimals = observedAnimals;
    }

    @Override
    public void work() {
        observedAnimals.forEach(animal -> {
                    if (animal.isHealthy()) {
                        System.out.println("Everything ok");
                    } else {
                        System.out.println("One more operation");
                        animal.setHealthy(true);
                    }
                }
        );
    }

    @Override
    public void finishWork() {
        System.out.println("Finish heal");
    }
}