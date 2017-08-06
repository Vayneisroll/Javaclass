/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit08;

import java.util.Scanner;
/**
 *
 * @author tenberge
 */
public class IfElseNumber {
    
    public static void main(String[] args) {
        
        Scanner kb = new Scanner(System.in);
        System.out.println("Please enter some temperature, dude: ");
        String line = kb.nextLine();
        int rumpelstilzchen = Integer.parseInt(line);
        
        if (rumpelstilzchen <= 32) {
            System.out.println("It's freezing! Don't forget your coat");
        } else {
            System.out.println("Bring a sweater.");
        } 
    }
}
