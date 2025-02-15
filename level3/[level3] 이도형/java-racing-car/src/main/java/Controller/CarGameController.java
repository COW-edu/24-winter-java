package Controller;

import Model.CarGameModel;
import View.CarGameConsoleView;

public class CarGameController implements CarApplication {
    private CarGameModel carGameModel;
    private CarGameConsoleView carGameConsoleView;

    public CarGameController(CarGameModel gameModel, CarGameConsoleView gameConsoleView){
        this.carGameModel = gameModel;
        this.carGameConsoleView = gameConsoleView;
    }

    @Override
    public void run() {
        try{
            String names = carGameConsoleView.requestNames();
            int count = carGameConsoleView.requestCount();
            carGameConsoleView.getOutputHandler().beginGame(carGameModel.produceCarGame(names), count);
            carGameConsoleView.getOutputHandler().showResult(carGameModel.judgementWinner());
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
