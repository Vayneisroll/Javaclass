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
public class EchoTwoUserString {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        System.out.println("Please enter a String:");
        String line1 = kb.nextLine();
        
        System.out.println("Please enter another String:");
        String line2 = kb.nextLine();
        
        System.out.println(line1 + line2);
    }
}
