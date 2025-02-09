package practice;

import java.util.*;
import camp.nextstep.edu.missionutils.Console;

public class Application {

    public static void enterCarName() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String names = Console.readLine();

        String nameList[] = names.split(",");
        List<Car> cars = new ArrayList<>();
        for (String name : nameList) {
            cars.add(new Car(name));
        }
        Car.tryGame(cars);

    }

    public static void main(String[] args) {
        enterCarName();
    }
}
