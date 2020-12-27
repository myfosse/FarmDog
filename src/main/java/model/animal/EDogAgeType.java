package model.animal;

public enum EDogAgeType {

    PUPPY(0, 1),
    ADULT(1, 8),
    OLD(8, 30);

    private final int lowerAgeLimit;
    private final int upperAgeLimit;

    EDogAgeType(int lowerAgeLimit, int upperAgeLimit) {
        this.lowerAgeLimit = lowerAgeLimit;
        this.upperAgeLimit = upperAgeLimit;
    }

    public int getLowerAgeLimit() {
        return lowerAgeLimit;
    }

    public int getUpperAgeLimit() {
        return upperAgeLimit;
    }
}