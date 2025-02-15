package practice.model;

import camp.nextstep.edu.missionutils.Console;

public class InputValidator {
    public static String validateCarNameInput() {
        String input = Console.readLine();
        if (input.isEmpty() || input.contains(",,")) {
            throw new IllegalArgumentException("[ERROR] 잘못된 자동차 이름 입력");
        }
        return input;
    }

    public static int validateAttemptsInput() {
        String input = Console.readLine();
        try {
            int attempts = Integer.parseInt(input);
            if (attempts <= 0) {
                throw new IllegalArgumentException("[ERROR] 시도 횟수는 0보다 커야 한다.");
            }
            return attempts;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("[ERROR] 시도 횟수는 숫자여야 한다.");
        }
    }
}
