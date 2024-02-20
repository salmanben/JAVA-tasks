import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = 0, num2 = 0, result = 0;
        char operator;

        try {
            System.out.println("Enter first number:");
            num1 = scanner.nextDouble();

            System.out.println("Enter operator (+, -, *, /):");
            operator = scanner.next().charAt(0);

            System.out.println("Enter second number:");
            num2 = scanner.nextDouble();

            switch(operator) {
                case '+':
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                    break;
                case '-':
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                    break;
                case '*':
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;
                case '/':
                    if(num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Error! Division by zero is not allowed.");
                    }
                    break;
                default:
                    System.out.println("Invalid operator!");
            }
        } catch (Exception e) {
            System.out.println("Error! Invalid input.");
        } finally {
            scanner.close();
        }
    }
}