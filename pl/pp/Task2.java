package pl.pp;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            displayMenu();
            System.out.print("Enter your choice (1/2/3/4/5): ");
            String choice = scanner.nextLine();

            if (choice.equals("1") || choice.equals("2") || choice.equals("3") || choice.equals("4")) {
                double num1 = getNumberInput("Enter first number: ");
                double num2 = getNumberInput("Enter second number: ");

                if (choice.equals("1")) {
                    System.out.println("Result: " + add(num1, num2));
                } else if (choice.equals("2")) {
                    System.out.println("Result: " + subtract(num1, num2));
                } else if (choice.equals("3")) {
                    System.out.println("Result: " + multiply(num1, num2));
                } else if (choice.equals("4")) {
                    System.out.println("Result: " + divide(num1, num2));
                }
            } else if (choice.equals("5")) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice! Please select a valid option.");
            }
        }
        scanner.close();
    }

    public static void displayMenu() {
        System.out.println("Calculator Menu:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Quit");
    }

    public static double getNumberInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        double num;

        while (true) {
            System.out.print(prompt);
            try {
                num = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid number.");
            }
        }
        return num;
    }

    public static double add(double x, double y) {
        return x + y;
    }

    public static double subtract(double x, double y) {
        return x - y;
    }

    public static double multiply(double x, double y) {
        return x * y;
    }

    public static double divide(double x, double y) {
        if (y == 0) {
            System.out.println("Error! Cannot divide by zero.");
            return 0;
        } else {
            return x / y;
        }
    }
}
