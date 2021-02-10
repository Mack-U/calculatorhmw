package calculator;

import java.util.Scanner;

public class trigCalculator {

	public static void main(String[] args) {
		Scanner NumInput = new Scanner(System.in);
        double firstNum = 0;
        double secondNum = 0;
        double result = 0;
        System.out.println("Enter first number: ");
        firstNum = NumInput.nextDouble() ;
        System.out.println("Enter operator: ");
        String answer = NumInput.next();
            if (answer == "sin" || answer == "cos" || answer == "tan" || answer == "cot"){
            switch(answer){
        case "sin":
            result = Math.toRadians(Math.sin(firstNum));
            break;
        case "cos":
            result = Math.toRadians(Math.cos(firstNum));
            break;
        case "tan":
            result = Math.toRadians(Math.tan(firstNum));
            break;
        case "cot":
            result = (Math.toRadians(Math.cos(firstNum))/Math.toRadians(Math.sin(firstNum)));
            break;

        default : 
            break;



            }
            System.out.println(Math.toRadians(result));
            }
            else

                System.out.println("Enter second number: ");
                secondNum = NumInput.nextDouble();  
            switch (answer){
        case "+":
            result = firstNum + secondNum;
            break;
        case "-":
            result = firstNum - secondNum;
            break;
        case "*":
            result = firstNum * secondNum;
            break;
        case "/":
            result = firstNum / secondNum;
            break;

        default:
            System.out.println("answer is ");
        }

            System.out.println(result);


	}

}
