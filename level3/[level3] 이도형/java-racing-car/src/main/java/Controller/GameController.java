package Controller;

import Model.GameModel;
import View.GameConsoleView;

public class GameController implements CarApplication {
    private GameModel gameModel;
    private GameConsoleView gameConsoleView;

    public GameController(GameModel gameModel, GameConsoleView gameConsoleView){
        this.gameModel = gameModel;
        this.gameConsoleView = gameConsoleView;
    }

    @Override
    public void run() {
        String names = gameConsoleView.requestNames();
        int count = gameConsoleView.requestCount();
        gameModel.produceCar(names, count);
        gameConsoleView.requestWinnerMessage(gameModel.judgementWinner());
    }
}
