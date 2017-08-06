/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit11;

import java.util.Scanner;

/**
 *
 * @author tenberge
 */
public class PasswordAttempts {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String myPassword = "openSesame";
        String userPass;
        int attempts = 0;
        do {
            System.out.println("Enter password:");
            userPass = kb.nextLine();
            attempts++;

        } while ((attempts < 3) && !userPass.equals(myPassword));

        if (userPass.equals(myPassword)) {
            System.out.println("You're logged in.");
        } else {
            System.out.println("Your account has been locked.");
        }
    }
}