/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit09;

import java.util.Scanner;

/**
 *
 * @author tenberge
 */
public class SwitchCaseExample {
    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Please enter a month as a number:");
        int month = Integer.parseInt(kb.nextLine());

        switch (month) {
            case 1: System.out.println("Yay! January!"); break;
            case 2: System.out.println("Dude, February!"); break;
            case 3: System.out.println("March... booooring..."); break;
            default: System.out.println("Sorry, that's not a valid month."); break;
        }

        System.out.println("After the switch");
    }
}
