package practice.model;

import practice.Car;
import practice.view.ConsoleView;

import java.util.List;

public class Race {
    private final List<Car> cars;
    private final int attempts;

    public Race(List<Car> cars, int attempts) {
        this.cars = cars;
        this.attempts = attempts;
    }

    public void startRace(ConsoleView consoleView) {
        for (int i = 0; i < attempts; i++) {
            for (Car car : cars) {
                car.randomMove();
            }
            consoleView.raceResults(cars);
        }
        displayWinners(consoleView);
    }

    private void displayWinners(ConsoleView consoleView) {
        StringBuilder winners = new StringBuilder();
        int maxPosition = getMaxPosition();

        for (Car car : cars) {
            if (car.getPosition() == maxPosition) {
                if (winners.length() > 0) {
                    winners.append(", ");
                }
                winners.append(car.getName());
            }
        }
        consoleView.displayWinners(winners.toString());
    }

    private int getMaxPosition() {
        int maxPosition = 0;
        for (Car car : cars) {
            int position = car.getPosition();
            if (position > maxPosition) {
                maxPosition = position;
            }
        }
        return maxPosition;
    }
}
