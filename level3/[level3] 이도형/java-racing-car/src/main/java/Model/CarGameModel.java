package Model;

import java.util.ArrayList;

public class CarGameModel {
    static ArrayList<Car> cars = new ArrayList<>();

    public ArrayList<Car> produceCarGame(String names){
        for(String name : names.split(",")){
            cars.add(new Car(name));
        }

        return cars;
    }


    public ArrayList<Car> judgementWinner(){
        int maxPostion = 0;
        ArrayList<Car> winners = new ArrayList<>();

        for(int i=0; i<cars.size(); i++){
            if(cars.get(i).getPosition() > maxPostion){
                maxPostion = cars.get(i).getPosition();
            }
        }
        for(int j =0; j< cars.size(); j++){
            if((cars.get(j).getPosition()) == maxPostion){
                winners.add(cars.get(j));
            }
        }
        return winners;
    }
}
