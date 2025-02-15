package view;

import model.Car;
import camp.nextstep.edu.missionutils.Console;
import java.util.*;

public class InputView {
    private static final int MAX_NAME_LENGTH = 5;
    public List<Car> getCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요. (쉼표(,) 기준으로 구분)");
        String input = Console.readLine();
        List<String> names = Arrays.asList(input.split(","));
        List<Car> cars = new ArrayList<>();

        for (String name : names) {
            if (name.length() > MAX_NAME_LENGTH || name.isBlank()) { //5를 MAX_NAME_LENGTH라는 상수로 선언
                throw new IllegalArgumentException("[ERROR] 이름은 1~" + MAX_NAME_LENGTH + "자 이내여야 합니다.");
            }
            cars.add(new Car(name.trim()));
        }
        return cars;
    }

    public int getTryNumber() {
        System.out.println("시도할 횟수는 몇 회인가요?");
        String input = Console.readLine();
        int tries;

        try {
            tries = Integer.parseInt(input);
            if (tries <= 0) {
                throw new IllegalArgumentException("[ERROR] 시도 횟수는 1 이상이어야 합니다.");
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("[ERROR] 숫자를 입력해야 합니다.");
        }
        return tries;
    }
}
