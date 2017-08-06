/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package unit10;

import java.util.Scanner;

/**
 *
 * @author Bastian Tenbergen (bastian.tenbergen@oswego.edu)
 */
public class PetNameGuessingGame {

    public static void main(String[] args) {
        
        String myPet = "Scooby";
        
        Scanner kb = new Scanner(System.in);
        System.out.println("Please enter your guess:");
        String userGuess = null;
        boolean wrongGuess = true;
        
        while ((userGuess == null ) || wrongGuess) {
            userGuess = kb.nextLine();
            if (!userGuess.equals(myPet)) {
                wrongGuess = false;
                System.out.println("Sorry, try again.");
            }
        }
        System.out.println("That's right, My pet's name is " + userGuess);
    }
}
