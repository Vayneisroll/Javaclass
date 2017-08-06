/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package unit06;

import java.util.Scanner;

/**
 *
 * @author Bastian Tenbergen (bastian.tenbergen@oswego.edu)
 */
public class IntConversion {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        String line1 = kb.nextLine();
        String line2 = kb.nextLine();
        
        int number1 = Integer.parseInt(line1);
        int number2 = Integer.parseInt(line2);
        double double1 = Double.parseDouble(kb.nextLine());
        
        System.out.println("Addition: " + (number1 + number2 + double1));
    }
}
