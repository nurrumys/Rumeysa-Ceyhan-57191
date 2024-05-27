import java.util.List;
import java.util.ArrayList;

public class Task3 {

    public static List<Task2> loadStudentData(List<Task2> studentList) {
        return studentList;
    }

    public static Task2 findStudentWithHighestAverage(List<Task2> studentList) {
        if (studentList.isEmpty()) {
            return null;
        }
        Task2 topStudent = studentList.get(0);
        for (Task2 student : studentList) {
            if (student.calculateAverageGrade() > topStudent.calculateAverageGrade()) {
                topStudent = student;
            }
        }
        return topStudent;
    }

    public static double calculateAverageGradeOfAllStudents(List<Task2> studentList) {
        if (studentList.isEmpty()) {
            return 0.0;
        }
        double totalSum = 0;
        for (Task2 student : studentList) {
            totalSum += student.calculateAverageGrade();
        }
        return totalSum / studentList.size();
    }

    public static void main(String[] args) {
        List<Task2> students = new ArrayList<>();
        students.add(new Task2("57191", "Rumeysa", "Ceyhan", List.of(67, 90, 45)));
        students.add(new Task2("56789", "Enes", "Yıldırım", List.of(75, 80, 88, 92)));
        students.add(new Task2("76543", "Busra", "Erken", List.of(90, 95, 85)));
        students.add(new Task2("56723", "Cıhan", "Bulut", List.of(70, 75, 80)));

        List<Task2> loadedStudents = loadStudentData(students);
        Task2 topStudent = findStudentWithHighestAverage(loadedStudents);
        double averageGradeAllStudents = calculateAverageGradeOfAllStudents(loadedStudents);

        if (topStudent != null) {
            System.out.println("Top Student: " + topStudent.getFirstName() + " " + topStudent.getLastName() + " with average grade: " + topStudent.calculateAverageGrade());
        } else {
            System.out.println("No students found.");
        }
        System.out.println("Average Grade of All Students: " + averageGradeAllStudents);
    }
}
