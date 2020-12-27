package model.area;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import model.animal.Animal;

import java.util.HashSet;
import java.util.Set;

@Data
@Builder
@NoArgsConstructor
public class TrainingArea<T extends Animal> {
    private int square;
    private int amountOfObstacles;
    private Set<T> trainingAnimals = new HashSet<>();
}