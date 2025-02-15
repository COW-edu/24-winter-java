package practice.controller;

import practice.model.Race;
import practice.Car;
import practice.model.InputValidator;
import practice.view.ConsoleView;

import java.util.ArrayList;
import java.util.List;

public class RaceController {
    private final ConsoleView consoleView = new ConsoleView();

    public void userInput() {
        List<Car> cars = getCarNames();
        int attempts = getAttempts();

        Race race = new Race(cars, attempts);
        race.startRace(consoleView);
    }

    private List<Car> getCarNames() {
        while (true) {
            try {
                System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
                String carNameInput = InputValidator.validateCarNameInput();
                String[] carNames = carNameInput.split(",");
                List<Car> cars = new ArrayList<>();

                for (String name : carNames) {
                    if (name.length() > 5) {
                        throw new IllegalArgumentException("[ERROR] 자동차 이름의 길이는 5자 이하만 가능");
                    }
                    cars.add(new Car(name));
                }
                return cars;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private int getAttempts() {
        while (true) {
            try {
                System.out.println("시도할 횟수는 몇회인가요?");
                return InputValidator.validateAttemptsInput();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
