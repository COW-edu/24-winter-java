package controller;

import model.Car;
import view.OutputView;
import camp.nextstep.edu.missionutils.Randoms;
import java.util.*;

public class RacingCarGame {
    private final List<Car> cars;
    private final int tries;

    public RacingCarGame(List<Car> cars, int tries) {
        this.cars = cars;
        this.tries = tries;
    }

    public void startRace(OutputView outputView) {
        outputView.printMessage("실행 결과");

        for (int i = 0; i < tries; i++) {
            raceOnce();
            outputView.printRaceResult(cars);
        }

        endWinners(outputView);
    }

    public void raceOnce() {
        for (Car car : cars) {
            if (Randoms.pickNumberInRange(0, 9) >= 4) { //0~9사이의 랜덤 숫자를 뽑아 4이상이면 자동차 이동시킨다
                car.move();
            }
        }
    }

    private void endWinners(OutputView outputView) {
        int maxPosition = cars.stream().mapToInt(Car::getPosition).max().orElse(0);
        List<String> winners = new ArrayList<>();

        for (Car car : cars) {
            if (car.getPosition() == maxPosition) {
                winners.add(car.getName());
            }
        }
        outputView.printWinners(winners);
    }
}
