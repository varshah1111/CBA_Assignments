/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cba;

/**
 *
 * @author varsha
 */
import java.util.*;
public class PasswordPrompt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correctPassword = "java123";
        String enteredPassword;
        int count=0;
        do {
            if(count>=5){
                System.out.println("Maximum Attempt ");
                System.exit(0);
            }
            System.out.print("Enter password: ");
            enteredPassword = scanner.nextLine();
            if (!enteredPassword.equals(correctPassword)) {
                System.out.println("Incorrect password. Please try again.");
                count++;
            }
        } while (!enteredPassword.equals(correctPassword));

        System.out.println("Access granted! at attempt: "+(count+1));
        scanner.close();
    }
}
