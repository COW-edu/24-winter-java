package practice;

import java.util.*;
import camp.nextstep.edu.missionutils.Console;

public class RacingGame {
    void start() {
        List<Car> cars = createCars(getCarNames());
        int tryNumber = getTryCount();
        runRace(cars, tryNumber);
    }

    private String[] getCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        return Console.readLine().split(",");
    }

    private List<Car> createCars(String[] nameList) {
        List<Car> cars = new ArrayList<>();
        for (String name : nameList) {
            cars.add(new Car(name));
        }
        return cars;
    }
    private int getTryCount() {
        System.out.println("시도할 회수는 몇회인가요?");
        return Integer.parseInt(Console.readLine());
    }

    private void runRace(List<Car> cars, int tryNumber) {
        System.out.println("실행 결과");
        for (int i = 0; i < tryNumber; i++) {
            performRaceRound(cars);
            printRaceResults(cars);
            System.out.println();
        }
        compareCarPosition(cars);
    }

    private void performRaceRound(List<Car> cars) {
        for (Car car : cars) {
            car.tryMove();
        }
    }

    private void printRaceResults(List<Car> cars) {
        for (Car car : cars) {
            System.out.print(car.getName() + " : ");
            for(int i =0;i<car.getPosition();i++){
                System.out.print("-");
            }
        }
    }

    private void compareCarPosition(List<Car> cars){
        int max_position = cars.get(0).getPosition();
        for(int i =1;i<cars.size();i++){
            if(cars.get(i).getPosition() > max_position){
                max_position = cars.get(i).getPosition();
            }
        }
        findWinners(cars, max_position);
    }

    private void findWinners(List<Car> cars,int max_position) {
        List<Car> winners = new ArrayList<>();
        for(Car car : cars){
            if(car.getPosition() == max_position){
                winners.add(car);
            }
        }
        printWinners(winners);
    }

    private void printWinners(List<Car> winners) {
        System.out.print("최종 우승자 : ");
        for (int i = 0; i < winners.size(); i++) {
            if (i == winners.size()-1) {
                System.out.print(winners.get(i).getName());
                return;
            }
            System.out.print(winners.get(i).getName()+", ");
        }
    }
}
