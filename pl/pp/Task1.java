package pl.pp;

import java.util.Scanner;

public class Task1 {

    public static int sumOfSquares(int lower, int upper) {
        int total = 0;
        for (int i = lower; i <= upper; i++) {
            total += i * i;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter lower and upper integer limits: ");
            int lowerLimit = scanner.nextInt();
            int upperLimit = scanner.nextInt();

            if (upperLimit <= lowerLimit) {
                System.out.println("Upper limit should be greater than the lower limit.");
                break;
            }

            int result = sumOfSquares(lowerLimit, upperLimit);
            System.out.printf("The sum of the squares from %d to %d is %d%n", lowerLimit * lowerLimit, upperLimit * upperLimit, result);

            if (lowerLimit == upperLimit) {
                System.out.println("Done");
                break;
            }
        }

        scanner.close();
    }
}