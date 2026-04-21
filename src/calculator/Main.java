package calculator;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Java Command Line Calculator --- ");

        //Input first number
        System.out.println("'Enter first number");
        double num1 = sc.nextDouble();

        //Input operator
        System.out.println("Enter operator (+ , - , * , / ): ");
        char operator = sc.next().charAt(0);

        //Input second number
        System.out.println("Enter second number : ");
        double num2 = sc.nextDouble();

        double result;

        // Perform calculator based on operator
        switch (operator) {
            case '+':
                result = num1 + num2 ;
                break ;
            case '-' :
                result = num1 - num2 ;
                break ;
            case '*' :
                result = num1 * num2 ;
                break ;
            case '/' :
                // Handle division by zero
                if (num2 != 0){
                    result = num1 / num2 ;
            }else {
                    System.out.println("Error: Division by zero is not allowed .");
                    return;
                 }
                break;
            default:
                System.out.println("Error : Invalid operator.");
                return;
        }

        System.out.printf("Result: %.2f %c %.2f = %.2f%n", num1, operator , num2 , result);
        sc.close();

    }
}
