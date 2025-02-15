import Controller.CarGameController;
import Model.CarGameModel;
import View.CarGameConsoleView;

public class Application {
    public static void main(String[] args) {
        CarGameModel gameModel = new CarGameModel();
        CarGameConsoleView gameView = new CarGameConsoleView();
        CarGameController gameController = new CarGameController(gameModel, gameView);
        gameController.run();
    }
}
