package Model;


import camp.nextstep.edu.missionutils.Randoms;
import org.junit.jupiter.api.MethodOrderer;

public class Car {
    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    // 추가 기능 구현

    public void getRandomNumber(){
        int randomNumber = Randoms.pickNumberInRange(1, 10);
        if(randomNumber>4){
            goForward();
        }
    }
    public void goForward(){
        this.position += 1;
    }

    public int getPosition(){
        return this.position;
    }

    public String showPosition(){
        return "-".repeat(this.position);
    }

    public String getName(){
        return this.name;
    }
}
