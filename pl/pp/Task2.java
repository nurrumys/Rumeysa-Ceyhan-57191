package pl.pp;

public class Task2 {
    public static void main(String[] args) {

        printCharacter('*', 5, 3);
    }

    private static void printCharacter(char character, int timesInRow, int lines) {
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < timesInRow; j++) {
                System.out.print(character);
            }
            System.out.println();
        }
    }
}