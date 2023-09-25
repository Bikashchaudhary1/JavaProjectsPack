package ClassWorkAssignment;


    import java.util.Scanner;

    public class ResultGenerator {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the number of subjects: ");
            int numSubjects = scanner.nextInt();

            double totalMarks = 0;

            for (int i = 1; i <= numSubjects; i++) {
                System.out.print("Enter marks for subject " + i + ": ");
                double marks = scanner.nextDouble();
                totalMarks += marks;
            }

            double average = totalMarks / numSubjects;

            System.out.println("Average marks: " + average);

            if (average >= 90) {
                System.out.println("Excellent!");
            } else if (average >= 75) {
                System.out.println("Very Good!");
            } else if (average >= 50) {
                System.out.println("Pass!");
            } else {
                System.out.println("Fail!");
            }
        }
    }


