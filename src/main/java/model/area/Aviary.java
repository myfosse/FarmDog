package model.area;

import lombok.*;
import model.animal.Animal;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
public class Aviary {

    private int liftingCapacity;
    private int length;
    private int width;
    private int height;
    private Animal currentAnimalIn;

    @Builder
    public Aviary(int liftingCapacity, int length, int width, int height) {
        this.liftingCapacity = liftingCapacity;
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public void setCurrentAnimalIn(Animal currentAnimalIn) {
        if (currentAnimalIn.getLength() <= length &&
                currentAnimalIn.getWeight() <= width &&
                currentAnimalIn.getHeight() <= height &&
                currentAnimalIn.getWeight() <= liftingCapacity) {
            this.currentAnimalIn = currentAnimalIn;
        }
        else {
            System.out.println("The animal won not fit in");
        }
    }
}