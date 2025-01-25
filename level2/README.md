# 레벨 2
package Homework2;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Level2 {
public static void main(String[] args) {
Calculator calculator = new Calculator();
calculator.inputNumbers();
}
}

class Calculator {

    public Calculator() {
    }

    public void inputNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("덧셈할 문자열을 입력해 주세요.");

        String input = scanner.nextLine();
        calculateSum(input);

        scanner.close();
    }

    public void calculateSum(String input) {
        
        if (input.isEmpty()) {
            System.out.println("결과: 0");
            return;
        }

        
        String[] parts = splitInput(input);
        int sum = 0;

        try {
            for (String part : parts) {
                
                sum += Integer.parseInt(part.trim());
            }
            System.out.println("결과: " + sum);
        } catch (NumberFormatException e) {
            System.out.println("숫자로 변환할 수 없는 값이 포함되어 있습니다.");
        }
    }

    
    public String[] splitInput(String input) {
        
        if (input.startsWith("//")) {
            int index = input.indexOf('\n');
            if (index == -1) {
                System.out.println("잘못된 사용자 정의 구분자 형식입니다.");
                return new String[0];
            }

           
            String delimiter = input.substring(2, index);

            String numbers = input.substring(index + 1);

            
            String escapedDelimiter = Pattern.quote(delimiter);
            return numbers.split(escapedDelimiter);
        }

        return input.split("[,:]");
    }
}
