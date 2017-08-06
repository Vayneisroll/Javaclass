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
public class SwitchCaseExampleReversed {
    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Please enter a month as a word:");
        String month = kb.nextLine();
        
        switch (month) {
            case "January": case "january": System.out.println("It's 1!"); break;
            case "February": System.out.println("It's 2!"); break;
            case "March": System.out.println("It's 3!"); break;
            case "April": System.out.println("It's 4!"); break;
            case "May": System.out.println("It's 5!"); break;
            case "June": System.out.println("It's 6!"); break;
            case "July": System.out.println("It's 7!"); break;
            case "August": System.out.println("It's 8!"); break;
            case "September": System.out.println("It's 9!"); break;
            case "October": System.out.println("It's 10!"); break;
            case "November": System.out.println("It's 11!"); break;
            case "December": System.out.println("It's 12!"); break;
            default: System.out.println("That's not a valid month."); break;
        }
    }
}
