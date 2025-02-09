package View;

import Model.Car;

import java.util.ArrayList;

public class GameConsoleView implements GameView{
    private InputHandler inputHandler;
    private OutputHandler outputHandler;

    public GameConsoleView(){
        this.inputHandler = new InputHandler();
        this.outputHandler = new OutputHandler();
    }

    @Override
    public String requestNames() {
        return inputHandler.getUserNames();
    }

    @Override
    public int requestCount() {
        return inputHandler.getCount();
    }

    public void requestWinnerMessage(ArrayList<Car> winners){
        outputHandler.showMessage();
        outputHandler.showResult(winners);
    }

}
