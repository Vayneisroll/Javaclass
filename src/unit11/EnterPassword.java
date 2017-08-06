/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package unit11;

import java.util.Scanner;

/**
 *
 * @author Bastian Tenbergen (bastian.tenbergen@oswego.edu)
 */
public class EnterPassword {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String pass = "openSesame";
        int numberGuesses = 0;
        String userGuess;
        boolean accessGranted = false;
        
        do {
            numberGuesses++;
            System.out.println("Enter pass:");
            userGuess = kb.nextLine();
            if (pass.equals(userGuess)) {
                accessGranted = true;
            } else {
                System.out.println("Sorry, invalid password. Remaining tries: " + (3 - numberGuesses));
            }
            
        } while ( (numberGuesses < 3) && !accessGranted);
        
        if (accessGranted) {
            System.out.println("Access granted!");
        } else {
            System.out.println("Account locked!");
        }
    }
}
