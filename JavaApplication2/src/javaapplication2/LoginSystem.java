/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;


import java.util.Scanner;

public class LoginSystem {
    private static final String VALID_USERNAME = "ELTON";
    private static final String VALID_PASSWORD = "123@password";
    private static final int MAX_ATTEMPTS = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int attemptsLeft = MAX_ATTEMPTS;
        boolean isLoggedIn = false;

        while (attemptsLeft > 0 && !isLoggedIn) {
            System.out.println("Attempts left: " + attemptsLeft);
           
            System.out.print("Enter username: ");
            String username = scanner.nextLine();
            
            System.out.print("Enter password (each character will be shown as *): ");
            StringBuilder password = new StringBuilder();
            String input = scanner.nextLine();
            
            
            for (char c : input.toCharArray()) {
                password.append(c);
                System.out.print("*");
            }
            System.out.println(); 

            if (username.equals(VALID_USERNAME) && password.toString().equals(VALID_PASSWORD)) {
                System.out.println("Login successful! Welcome, " + username + ".");
                isLoggedIn = true;
            } else {
                attemptsLeft--;
                if (attemptsLeft > 0) {
                    System.out.println("Invalid username or password. Please try again.");
                } else {
                    System.out.println("Maximum attempts reached. Access denied.");
                }
            }
        }
        scanner.close();
    }
}
