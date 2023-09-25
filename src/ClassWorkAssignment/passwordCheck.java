package ClassWorkAssignment;

    import java.util.Scanner;

    public class passwordCheck{

        public static void main(String[] args) {
            passwordChecker();
        }

        public static void passwordChecker() {
            String correctPassword = "secret123";  // Change this to your desired password
            int maxTries = 5;
            Scanner scanner = new Scanner(System.in);

            for (int attempt = 0; attempt < maxTries; attempt++) {
                System.out.print("Enter your password: ");
                String userInput = scanner.nextLine();

                if (userInput.equals(correctPassword)) {
                    System.out.println("Password is correct! Access granted.");
                    return;
                } else {
                    int remainingAttempts = maxTries - (attempt + 1);
                    if (remainingAttempts > 0) {
                        System.out.println("Incorrect password! You have " + remainingAttempts + " attempts left.");
                    } else {
                        System.out.println("You have exceeded the maximum number of attempts! Access denied.");
                    }
                }
            }
        }
    }


