package Main;


import Controller.GameController;
import Model.GameModel;
import View.GameConsoleView;

public class Application {
    public static void main(String[] args) {
        GameModel gameModel = new GameModel();
        GameConsoleView gameView = new GameConsoleView();
        GameController gameController = new GameController(gameModel, gameView);
        gameController.run();
    }
}
