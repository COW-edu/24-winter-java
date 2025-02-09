package View;


import camp.nextstep.edu.missionutils.Console;

public class InputHandler {

    public String getUserNames(){
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String name = Console.readLine();
        return name;
    }

    public int getCount(){
        System.out.println("시도할 회수는 몇회인가요?");
        int count=0;
        try{
            count = Integer.parseInt(Console.readLine());
        }catch (IllegalArgumentException e){
            System.out.println("[ERROR] 시도 횟수는 숫자여야 한다.");
        }
        return  count;
    }
}
