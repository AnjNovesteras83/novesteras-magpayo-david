import java.util.Scanner;

public class Calculator {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error! Division by zero is not allowed.");
            return 0;
        }
        return (double) a / b;
    }

    public static int modulus(int a, int b) {
        return a % b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        int num1 = scanner.nextInt();

        System.out.println("Enter second number:");
        int num2 = scanner.nextInt();

        System.out.println("Choose operation: +, -, *, /, %");
        char operation = scanner.next().charAt(0);

        int resultInt;
        double resultDouble;

        switch (operation) {
            case '+':
                resultInt = add(num1, num2);
                System.out.println("Result: " + resultInt);
                break;
            case '-':
                resultInt = subtract(num1, num2);
                System.out.println("Result: " + resultInt);
                break;
            case '*':
                resultInt = multiply(num1, num2);
                System.out.println("Result: " + resultInt);
                break;
            case '/':
                resultDouble = divide(num1, num2);
                System.out.println("Result: " + resultDouble);
                break;
            case '%':
                resultInt = modulus(num1, num2);
                System.out.println("Result: " + resultInt);
                break;
            default:
                System.out.println("Invalid operation!");
                break;
        }

        scanner.close();
    }
}
