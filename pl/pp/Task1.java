package pl.pp;

import java.io.*;
import java.nio.file.*;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String userDirectory = System.getProperty("user.dir");
        System.out.println("The current directory is:");
        System.out.println(userDirectory);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the path to the input text file:");
        String inputFilePath = scanner.nextLine();

        System.out.println("Enter the path to the output text file:");
        String outputFilePath = scanner.nextLine();

        Path inputPath = Paths.get(inputFilePath);

        try {
            if (!Files.exists(inputPath)) {
                System.out.println("The input file does not exist. Please provide a valid file path.");
                return;
            }

            long lineCount = Files.lines(inputPath).count();

            System.out.println("Number of lines in the input file: " + lineCount);

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {
                writer.write("Input File: " + inputPath.getFileName() + "\n");
                writer.write("Number of Lines: " + lineCount);
            } catch (IOException e) {
                System.out.println("Error writing to the output file.");
                e.printStackTrace();
            }

        } catch (IOException e) {
            System.out.println("Error reading the input file.");
            e.printStackTrace();
        }
    }
}
