package model.animal;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import model.diet.EDogDiet;
import model.work.DoOwnWork;
import model.work.EDogWorkType;
import model.work.Feeding;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class Dog extends Animal implements Feeding<EDogDiet>, DoOwnWork {

    private EDogAgeType dogAgeType;
    private EDogWorkType dogWorkType;
    private boolean isTrained;

    @Builder(builderMethodName = "DogBuilder")
    public Dog(int weight, int length, int width, int height, String mainColor, int yearsOld,
               boolean isFed, boolean isHealthy,
               boolean isTrained) {
        super(weight, length, width, height, mainColor, yearsOld, isFed, isHealthy);
        setYearsOld(yearsOld);
        this.isTrained = isTrained;
    }

    public void setDogAgeType(EDogAgeType dogAgeType) {
        if (dogAgeType.getLowerAgeLimit() <= getYearsOld() && dogAgeType.getUpperAgeLimit() > getYearsOld()) {
            System.out.println("Age type set");
        } else {
            System.out.println("Age type not suitable");
        }
    }

    public void setYearsOld(int yearsOld) {
        if (yearsOld < 1) {
            setDogAgeType(EDogAgeType.PUPPY);
        } else if (yearsOld < 8) {
            setDogAgeType(EDogAgeType.ADULT);
        } else {
            setDogAgeType(EDogAgeType.OLD);
        }
        super.setYearsOld(yearsOld);
    }

    public void setDogWorkType(EDogWorkType dogWorkType) {
        if (dogWorkType.getLowerAgeLimit() <= getYearsOld() && dogWorkType.getUpperAgeLimit() > getYearsOld()) {
            System.out.println("Work set");
        } else {
            System.out.println("Work is not suitable");
        }
    }

    @Override
    public void feedAnimal(EDogDiet eDogDiet) {
        if (eDogDiet.getLowerAgeLimit() <= getYearsOld() && eDogDiet.getUpperAgeLimit() > getYearsOld()) {
            System.out.println("Diet set");
        } else {
            System.out.println("Diet is not suitable");
        }
    }

    @Override
    public void work() {
        System.out.println("The dog went to work in " + dogWorkType);
    }

    @Override
    public void finishWork() {
        System.out.println("The dog comes back from " + dogWorkType);
    }
}