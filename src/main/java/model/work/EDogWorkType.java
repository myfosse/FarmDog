package model.work;

public enum EDogWorkType {

    TRAIN(0, 1),
    POLICE(1, 8),
    EMERGENCY(1, 8),
    FARM(8, 30);

    private final int lowerAgeLimit;
    private final int upperAgeLimit;

    EDogWorkType(int lowerAgeLimit, int upperAgeLimit) {
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