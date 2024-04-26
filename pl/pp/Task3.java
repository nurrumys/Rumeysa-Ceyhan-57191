package pl.pp;

import java.util.Scanner;

public class Task3 {

    public static long ageToSeconds(int ageInYears) {
        return ageInYears * 365 * 24 * 60 * 60;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age in years: ");
        int ageInYears = scanner.nextInt();

        long ageInSeconds = ageToSeconds(ageInYears);

        System.out.println("Your age in seconds: " + ageInSeconds);

        scanner.close();
    }
}
