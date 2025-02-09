package View;

import Model.Car;

import java.util.ArrayList;

public class OutputHandler {
    public OutputHandler(){}

    public void showMessage(){
        System.out.print("최종 우승자: ");
    }

    public void showResult(ArrayList<Car> winners){
        StringBuffer result = new StringBuffer();
        for(int i =0; i< winners.size(); i++){
            result.append(winners.get(i) + ",");
        }
        result.deleteCharAt(result.length() -1);
        System.out.print(result);
    }

}
