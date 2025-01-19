# 레벨 2
package Homework2;

import java.util.*;

public class Level2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("덧셈할 문자열을 입력해 주세요.");

        String input = sc.nextLine();
        if (input.isEmpty()) {
            System.out.println("결과: 0");
            return;
        }

        String parts[] = exchange(input);
        int sum = 0;

        try {
            for (String part : parts) {
                sum += Integer.parseInt(part.trim());
            }

            System.out.println("결과: " + sum);
        } catch (IllegalArgumentException e) {
            System.out.println("숫자로 변환할 수 없는 값이 포함되어 있습니다.");
        }

        sc.close();
    }

    public static String[] exchange(String input) {
        if (input.startsWith("//")) {
            int index = input.indexOf('\n');
            String c = input.substring(2,index);

            String num = input.substring(index + 1);
            
            //이 부분에서 오류가 나는거 같습니다.....
            String result = "[" + c + "]";
            String[] parts1 = num.split(result);
            return parts1;
        }

        String[] parts2 = input.split("[,:]");
        return parts2;
    }
}
