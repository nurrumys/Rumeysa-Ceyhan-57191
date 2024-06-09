package pl.pp;

import java.io.*;
import java.nio.file.*;
import java.util.*;

class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the path of the input file:");
        String inputFilePath = scanner.nextLine();
        System.out.println("Please enter the path of the output file:");
        String outputFilePath = scanner.nextLine();

        Path inputFile = Paths.get(inputFilePath);
        Path outputFile = Paths.get(outputFilePath);

        while (!Files.exists(inputFile)) {
            System.out.println("The input file does not exist. Please enter a valid path:");
            inputFilePath = scanner.nextLine();
            inputFile = Paths.get(inputFilePath);
        }

        try {
            List<String> lines = Files.readAllLines(inputFile);
            Map<String, Integer> wordCount = new HashMap<>();

            for (String line : lines) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    word = word.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
                    wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                }
            }

            int totalWords = wordCount.values().stream().mapToInt(Integer::intValue).sum();
            System.out.println("Total number of words: " + totalWords);

            List<String> outputLines = new ArrayList<>();
            outputLines.add("Filename: " + inputFile.getFileName());
            outputLines.add("Total words: " + totalWords);
            outputLines.add("Word count:");
            for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
                outputLines.add(entry.getKey() + ": " + entry.getValue());
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

            Files.write(outputFile, outputLines);

        } catch (IOException e) {
            System.out.println("An error occurred while processing the file: " + e.getMessage());
        }
    }
}