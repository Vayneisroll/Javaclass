/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit12;

import java.util.Scanner;
/**
 *
 * @author tenberge
 */
public class StringBackwards {
    
    public static void main(String[] args) {
        
        Scanner kb = new Scanner(System.in);
        String line = kb.nextLine();
       
        char[] thisString = new char[line.length()];
        
        for (int i = 0; i < line.length(); i++) {
            thisString[i] = line.charAt(i);
        }
        
        for (int i = thisString.length-1; i >= 0; i--) {
            System.out.println(thisString[i]);
        }
    }
}
