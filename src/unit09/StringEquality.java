/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package unit09;

import java.util.Scanner;

/**
 *
 * @author Bastian Tenbergen (bastian.tenbergen@oswego.edu)
 */
public class StringEquality {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Please enter your school:");
        String school = kb.nextLine();
        
        if (school.equals("Oswego") || school.equals("SUNY Oswego") || school.equalsIgnoreCase("OSWEGo State")) {
            System.out.println("Me too!");
        } else {
            System.out.println("That's nice. :-(");
        }
    }
}
