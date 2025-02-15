package Model;


import camp.nextstep.edu.missionutils.Randoms;

public class Car {
    private final String name;
    private int position = 0;
    private final int randomLowNumber = 1;
    private final int randomMaxNumber = 10;
    private final int goForwardNumber = 4;

    public Car(String name) {
        this.name = name;
    }

    // 추가 기능 구현

    public void getRandomNumber(){
        int randomNumber = Randoms.pickNumberInRange(randomLowNumber, randomMaxNumber);
        if(randomNumber>=goForwardNumber){
            goForward();
        }
    }
    private void goForward(){
        this.position += 1;
    }

    public int getPosition(){
        return this.position;
    }

    public String getPostionMarker(){
        return "-".repeat(this.position);
    }

    public String getName(){
        return this.name;
    }
}
