import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Comparator;

public class Task3 {

    public static List<Task2> loadStudentData(List<Task2> studentList) {
        return studentList;
    }

    public static Task2 findStudentWithHighestAverage(List<Task2> studentList) {
        if (studentList.isEmpty()) {
            return null;
        }
        return studentList.stream()
                .max(Comparator.comparingDouble(Task2::calculateAverageGrade))
                .orElse(null);
    }

    public static double calculateAverageGradeOfAllStudents(List<Task2> studentList) {
        if (studentList.isEmpty()) {
            return 0.0;
        }
        double totalSum = studentList.stream()
                .mapToDouble(Task2::calculateAverageGrade)
                .sum();
        return totalSum / studentList.size();
    }

    public static void printStudentsSortedByLastName(List<Task2> studentList) {
        studentList.stream()
                .sorted(Comparator.comparing(Task2::getLastName))
                .forEach(student -> System.out.println(student));
    }

    public static void main(String[] args) {
        List<Task2> students = Arrays.asList(
                new Task2("57191", "Rumeysa", "Ceyhan", Arrays.asList(90, 50, 30, 40)),
                new Task2("57812", "Cıhan", "Ceran", Arrays.asList(70, 30, 20, 40)),
                new Task2("56789", "Ayse", "Erken", Arrays.asList(20, 80, 30, 60)),
                new Task2("57435", "Enes", "Bulut", Arrays.asList(50, 90, 80, 90))
        );

        List<Task2> loadedStudents = loadStudentData(students);

        // Find the student with the highest average grade
        Task2 topStudent = findStudentWithHighestAverage(loadedStudents);
        if (topStudent != null) {
            System.out.println("Student with the highest average: " + topStudent);
        } else {
            System.out.println("No students found.");
        }

        // Calculate the average grade of all students
        double averageGradeAllStudents = calculateAverageGradeOfAllStudents(loadedStudents);
        System.out.println("Average Grade of All Students: " + averageGradeAllStudents);

        // Print students sorted by last names
        System.out.println("Students sorted by last names:");
        printStudentsSortedByLastName(loadedStudents);
    }
}
