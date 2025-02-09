package practice;
import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class CarNameInput {
    public List<String> getCarNames() {
        while (true) {
            try {
                System.out.println("경주할 자동차 이름을 입력하세요.{이름은 쉼표(,) 기준으로 구분)");
                String input = Console.readLine();

                if(input.isBlank()) {
                    throw new IllegalArgumentException("[ERROR] 값이 비어있습니다. 다시 입력하세요.");
                }
                List<String> names = Arrays.asList(input.split(","));
                for (String name : names) {
                    if (name.length() > 5) {
                        throw new IllegalArgumentException("[ERROR] 이름은 5자 이하만 가능합니다. 다시 입력하세요.");
                    }
                }
                return names;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

public class TryNumberInput {
    public int getTryNumber(){
        while (true) {
            try {
                System.out.println("시도할 횟수는 몇회인가요?");
                String input = Console.readLine();
                int tries = Integer.parseInt(input);

                if (tries <= 0) {
                    throw new IllegalArgumentException("[ERROR] 시도 횟수는 양수입니다. 다시 입력하세요.");
                }
                return tries;
            } catch (NumberFormatException e) {
                System.out.println("[ERROR] 시도 횟수는 숫자여야 합니다.");
            }
        }
    }
}

public class RandomMovement {
    public void moveCar(Car car) {
        int randomNum = Randoms.pickNumberInRange(0,9);
        if (randomNum >= 4) {
            car.move();
        }
    }
}

public class RacingCarGame {
    private List<Car> cars;
    private int tries;
    private RandomMovement randomMovement;

    public RacingCarGame(List<String> carNames, int tries) {
        this.cars = new ArrayList<>();
        for (String name : carNames) {
            cars.add(new Car(name));
        }
        this.tries = tries;
        this.randomMovement = new RandomMovement();
    }

    public void startRace() {
        System.out.println("실행결과");
        for (int i = 0; i < tries; i++) {
            raceOnce();
            currentRaceResult();
        }
        endWinners();
    }

    private void raceOnce() {
        for (Car car : cars) {
            randomMovement.moveCar(car);
        }
    }

    private void currentRaceResult() {
        for (Car car : cars) {
            System.out.println(car.getName() + " : " + car.getPositionString());
        }
    }

    private void endWinners() {
        int maxPosition = 0;
        List<Car> winners = new ArrayList<>();

        for (Car car : cars) {
            if (car.getPosition() > maxPosition) {
                maxPosition = car.getPosition();
                winners.clear();
                winners.add(car);
                continue;
            }

            if (car.getPosition() == maxPosition) {
                winners.add(car);
            }
        }

        System.out.print("최종 우승자: ");
        for (int i = 0; i < winners.size(); i++) {
            System.out.print(winners.get(i).getName());
            if (i < winners.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}

public class Application {
    public static void main(String[] args) {
        CarNameInput carNameInput = new CarNameInput();
        List<String> carNames = carNameInput.getCarNames();

        TryNumberInput tryNumberInput = new TryNumberInput();
        int tries = tryNumberInput.getTryNumber();

        RacingCarGame racingCarGame = new RacingCarGame(carNames, tries);
        racingCarGame.startRace();
    }
}

