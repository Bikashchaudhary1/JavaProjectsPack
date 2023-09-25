package LoopHomeworkAssignment_01;


import java.util.Scanner;

public class GradeCalculation {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Ask user for the number of subjects
            System.out.print("Enter the number of subjects: ");
            int numOfSubjects = scanner.nextInt();

            double totalMarks = 0;

            // Loop to get marks for each subject
            for (int i = 1; i <= numOfSubjects; i++) {
                System.out.print("Enter marks for subject " + i + ": ");
                totalMarks += scanner.nextDouble();
            }

            // Calculate percentage
            double percentage = (totalMarks / (numOfSubjects * 100)) * 100;

            // Print the percentage
            System.out.println("Percentage: " + percentage + "%");

            // Determine grade based on percentage
            if (percentage >= 90) {
                System.out.println("Grade: A");
            } else if (percentage >= 80) {
                System.out.println("Grade: B");
            } else if (percentage >= 70) {
                System.out.println("Grade: C");
            } else if (percentage >= 60) {
                System.out.println("Grade: D   ");
            } else {
                System.out.println("Grade: Fail");
            }
        }
    }

