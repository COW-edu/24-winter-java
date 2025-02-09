package practice;

import java.util.*;
import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

public class Car {
    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    public void move() {
        position++;
    }

    public static void tryGame(List<Car> cars) {
        System.out.println("시도할 회수는 몇회인가요?");
        int tryNumber = Integer.parseInt(Console.readLine());

        runGameInformation(cars, tryNumber);
    }

    public static void runGameInformation(List<Car> cars, int tryNumber) {
        System.out.println("실행 결과");
        for (int i = 0; i < tryNumber; i++) {
            for (Car car : cars) {
                int randomNumber = Randoms.pickNumberInRange(0, 9);
                if (randomNumber >= 4) {
                    car.move();
                }
            }
            printResult(cars);
            System.out.println();
        }
        decideWinners(cars);
    }

    public static void printResult(List<Car> cars) {
        for (Car car : cars) {
            System.out.print(car.name + " : ");
            for (int i = 0; i < car.position; i++) {
                System.out.print("-");
            }
            System.out.println();
        }
    }

    public static void decideWinners(List<Car> cars) {
        int maxPosition = 0;
        List<Car> winner = new ArrayList<Car>();

        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).position > maxPosition) {
                maxPosition = cars.get(i).position;
            }
        }
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).position == maxPosition) {
                winner.add(cars.get(i));
            }
        }
        printWinners(winner);

    }

    public static void printWinners(List<Car> winner) {
        System.out.print("최종 우승자 : ");
        for (int i = 0; i < winner.size(); i++) {
            if (i == winner.size()-1) {
                System.out.print(winner.get(i).name);
                return;
            }
            System.out.print(winner.get(i).name+", ");
        }
    }

}