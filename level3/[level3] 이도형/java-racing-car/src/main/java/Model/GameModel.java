package Model;

import java.util.ArrayList;

public class GameModel {
    ArrayList<Car> cars = new ArrayList<>();

    public GameModel(){}

    public void produceCar(String names, int count){
        for(String name : names.split(",")){
            cars.add(new Car(name));
        }
        gameBegin(count);
    }

    public void gameBegin(int count){
        System.out.println("실행 결과");
        for(int i=0; i<count; i++){
            for(Car car : cars){
                car.getRandomNumber();
                System.out.println(car.getName() + " : " + car.showPosition());
            }
            System.out.println();
        }
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
        System.out.println(winners);
        return winners;
    }
}
