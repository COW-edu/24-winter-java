package practice;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {
    private static final int MIN_RANDOM_VALUE = 0;
    private static final int MAX_RANDOM_VALUE = 9;
    private static final int MIN_MOVE_FORWARD = 4;

    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    public void randomMove() {
        int randomValue = Randoms.pickNumberInRange(MIN_RANDOM_VALUE, MAX_RANDOM_VALUE);
        if (randomValue >= MIN_MOVE_FORWARD) {
            position++;
        }
    }

    public int getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }
}
