import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the path to the input text file
        System.out.println("Please enter the path to the input text file:");
        String inputFilePath = scanner.nextLine();

        // Check if the input file exists
        Path inputPath = Paths.get(inputFilePath);
        if (!Files.exists(inputPath) || Files.isDirectory(inputPath)) {
            System.out.println("Error: The file '" + inputFilePath + "' does not exist or is a directory.");
            return;
        }

        // Read the input file and count the number of lines
        int lineCount = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(inputPath.toFile()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lineCount++;
            }
        } catch (IOException e) {
            System.out.println("Error reading input file: " + e.getMessage());
            return;
        }

        // Display the number of lines to the user
        System.out.println("Number of lines in the file: " + lineCount);

        // Ask the user for the path to the output text file
        System.out.println("Please enter the path to the output text file:");
        String outputFilePath = scanner.nextLine();

        // Write the file name and the number of lines to the output text file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {
            writer.write("File: " + inputFilePath);
            writer.newLine();
            writer.write("Number of lines: " + lineCount);
            System.out.println("Results have been written to '" + outputFilePath + "'");
        } catch (IOException e) {
            System.out.println("Error writing to output file: " + e.getMessage());
        }

        scanner.close();
    }
}