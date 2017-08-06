/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit06;

import java.util.Scanner;

/**
 *
 * @author tenberge
 */
public class EnterStuff {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        System.out.println("Please enter a String: ");
        String line = kb.nextLine();
        System.out.println("You typed: " + line);

        System.out.println("Please enter an int: ");
        int number = Integer.parseInt(kb.nextLine());
        System.out.println("You entered the int: " + number);
        
        System.out.println("Please enter a double: ");
        double better = Double.parseDouble(kb.nextLine());
        System.out.println("You entered the double: " + better);
    }

}
