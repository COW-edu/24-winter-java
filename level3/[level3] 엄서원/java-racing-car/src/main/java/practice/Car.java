package practice;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {
    private static final int min_Random_Value = 0;
    private static final int max_Random_value = 9;
    private static final int move_MaginotLine = 4;

    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    void tryMove() {
        int randomValue = Randoms.pickNumberInRange(min_Random_Value, max_Random_value);
        if (randomValue >= move_MaginotLine) {
            move();
        }
    }

    private void move() {
        position++;
    }

    String getName() {
        return name;
    }

    int getPosition() {
        return position;
    }
}

