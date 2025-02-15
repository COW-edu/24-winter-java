package practice;

import controller.RacingCarGame;
import view.InputView;
import view.OutputView;
import model.Car;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();

        List<Car> cars = inputView.getCarNames();
        int tries = inputView.getTryNumber();

        RacingCarGame racingCarGame = new RacingCarGame(cars, tries);
        racingCarGame.startRace(outputView);
    }
}
