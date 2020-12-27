package model.staff;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import model.animal.Animal;
import model.area.TrainingArea;
import model.work.DoOwnWork;

import java.time.LocalDate;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class TrainerStaffEmployee extends Employee implements DoOwnWork {

    private TrainingArea<Animal> workTrainingArea;

    @Builder(builderMethodName = "TrainerStaffEmployeeBuilder")
    public TrainerStaffEmployee(String name, String surname, LocalDate birthdate,
                                int salary, int workExperience,
                                TrainingArea<Animal> workTrainingArea) {
        super(name, surname, birthdate, salary, workExperience);
        this.workTrainingArea = workTrainingArea;
    }

    @Override
    public void work() {
        System.out.println("Start train");
        workTrainingArea.getTrainingAnimals().forEach(animal -> System.out.println("Training " + animal.toString()));
    }

    @Override
    public void finishWork() {
        System.out.println("Finish train");
    }
}