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
public class StringComparison {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        System.out.println("Please enter you school:");
        String userSchool = kb.nextLine();
        String testSchool = "Oswego";

        if (testSchool.equals(userSchool)) {

            System.out.println("Me too!");
        } else {
            if (userSchool.equals("Oswego State")) {

                System.out.println("Me too!");

            } else {
                if (userSchool.equals("SUNY Oswego")) {
                    System.out.println("Me too!");
                } else {
                    System.out.println("That's nice.");
                }
            }
        }

    }
}
