package LoopHomeworkAssignment_01;

import java.util.Scanner;

public class LoginSystem {
    private static final String CORRECT_USERNAME = "Cr7Horaaa";
    private static final String CORRECT_PASSWORD = "Silent Please";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter your username: ");
            String username = scanner.nextLine();

            System.out.print("Enter your password: ");
            String password = scanner.nextLine();

            if (CORRECT_USERNAME.equals(username) && CORRECT_PASSWORD.equals(password)) {
                System.out.println("Login successful!");
                return;  // exit the program after successful login
            } else {
                if (i == 2) { // if it's the third incorrect attempt
                    System.out.println("Incorrect username or password. YOU ARE HACKER BRO.");
                } else {
                    System.out.println("Incorrect username or password. You have " + (2 - i) + " attempt(s) left.");
                }
            }
        }
    }
}
