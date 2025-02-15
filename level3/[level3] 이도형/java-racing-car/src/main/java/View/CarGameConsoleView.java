package View;

import Model.Car;


public class CarGameConsoleView implements CarGameView {
    private InputHandler inputHandler;
    private OutputHandler outputHandler;

    public CarGameConsoleView(){
        this.inputHandler = new InputHandler();
        this.outputHandler = new OutputHandler();
    }

    public OutputHandler getOutputHandler(){
        return this.outputHandler;
    }

    @Override
    public String requestNames() {
        return inputHandler.getUserNames();
    }

    @Override
    public int requestCount() {
        return inputHandler.getCount();
    }

}
