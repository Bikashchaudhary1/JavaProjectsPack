package AbsentHomewrok;

import java.util.Scanner;

public class CalculateResults {
    public static void main(String[] args) {
        // Create a Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of subjects
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        // Initialize variables to store total marks and average
        double totalMarks = 0.0;

        // Input marks for each subject and calculate the total
        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks for Subject " + i + ": ");
            double subjectMarks = scanner.nextDouble();
            totalMarks += subjectMarks;
        }

        // Calculate the average marks
        double averageMarks = totalMarks / numSubjects;

        // Display the result
        System.out.println("Total marks: " + totalMarks);
        System.out.println("Average marks: " + averageMarks);

        // Close the scanner
        scanner.close();
    }
}

