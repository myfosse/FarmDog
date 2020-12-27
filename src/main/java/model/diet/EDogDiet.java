package model.diet;

public enum EDogDiet {

    SPECIAL(0, 1),
    COMBINED(1, 8),
    MILD (8, 30);

    private final int lowerAgeLimit;
    private final int upperAgeLimit;

    EDogDiet(int lowerAgeLimit, int upperAgeLimit) {
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