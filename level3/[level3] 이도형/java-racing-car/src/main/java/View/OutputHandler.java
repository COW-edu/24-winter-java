package View;

import Model.Car;

import java.util.ArrayList;

public class OutputHandler {

    public void beginGame(ArrayList<Car> cars, int count){
        showRunMesseage();
        for(int i=0; i<count; i++){
            for(Car car : cars){
                car.getRandomNumber();
                System.out.println(car.getName() + " : " + car.getPostionMarker());
            }
            System.out.println();
        }
    }

    private void showRunMesseage(){
        System.out.println("실행 결과");
    }

    private void showWinnerMessage(){
        System.out.print("최종 우승자: ");
    }

    public void showResult(ArrayList<Car> winners){
        StringBuffer result = new StringBuffer();
        for(int i =0; i< winners.size(); i++){
            result.append(winners.get(i).getName() + ",");
        }
        result.deleteCharAt(result.length() -1);
        showWinnerMessage();
        System.out.print(result);
    }

}
