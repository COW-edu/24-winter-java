package cow_winter.level2;
import java.util.Scanner;

//문자열을 입력받는 클래스
class InputString {
 private Scanner scanner;

 public InputString() {
     scanner = new Scanner(System.in);
 }

 public String readInput() {
     System.out.println("덧셈할 문자열을 입력해 주세요.");
     return scanner.nextLine();
 }
}
 
//문자열 분리 인터페이스
interface StringSplitter {
 String[] split(String input);
}

class BasicStringSplitter implements StringSplitter {
	@Override
    public String[] split(String input) {
        if (input.startsWith("//")) {
            return CustomDelimiterSplitter(input);
        }
        return input.split("[,:]");  
    }

	  private String[] CustomDelimiterSplitter(String input) {
	        
	        int delimiterIndex = input.indexOf("\n");
	        //indexOf(String str):지정된 문자가 처음 등장하는 인덱스 반환 없으면 -1 빈환
	        if (delimiterIndex == -1) {
	            throw new IllegalArgumentException("잘못된 입력값입니다.");
	        }

	        String delimiter = input.substring(2, delimiterIndex);
	        if (delimiter.isEmpty()) {
	            throw new IllegalArgumentException("구분자가 비어있습니다.");
	        }

	        String numbers = input.substring(delimiterIndex + 1);
	        if (numbers.isEmpty()) {
	            throw new IllegalArgumentException("숫자가 비어있습니다.");
	        }

	        return numbers.split(delimiter);
	    }
	}

//문자열을 정수형으로 바꾸는 클래스
class StringToInteger {
    public int[] convertToInt(String[] splitInput) {
        int[] numbers = new int[splitInput.length];
        for (int i = 0; i < splitInput.length; i++) {
            try {
                numbers[i] = Integer.parseInt(splitInput[i]);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("잘못된 값입니다.: " + splitInput[i], e);
            }
        }
        return numbers;
    }
}


//정수형 계산기 클래스
class IntCalculator {
    public int calculateSum(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num; 
        }
        return sum;
    }
}

public class Application {
	
	public static void main(String[] args) {
		InputString inputString = new InputString();
		String input = inputString.readInput();
		
		StringSplitter stringSplitter = new BasicStringSplitter();
        String[] splitInput = stringSplitter.split(input);

        StringToInteger stringToInteger = new StringToInteger();
        int[] numbers = stringToInteger.convertToInt(splitInput);

        IntCalculator intCalculator = new IntCalculator();
        int sum = intCalculator.calculateSum(numbers);

        System.out.println("결과 : " + sum);
    }
}
		