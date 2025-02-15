package view;

import model.Car;
import java.util.List;

public class OutputView {
    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printRaceResult(List<Car> cars) {
        for (Car car : cars) {
            System.out.println(car.getName() + " : " + car.getPositionString());
        }
        System.out.println();
    }

    public void printWinners(List<String> winners) {
        System.out.println("최종 우승자: " + String.join(", ", winners));
    }
}
