/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package unit08;

import java.util.Scanner;
/**
 *
 * @author Bastian Tenbergen (bastian.tenbergen@oswego.edu)
 */
public class ConditionalExample {

    public static void main(String[] args) {
        
        Scanner kb = new Scanner(System.in);
        System.out.println("Please enter a temperature in deg F:");
        String line  =  kb.nextLine();
        int temp = Integer.parseInt(line);
        
        if (temp <= 32) {
            System.out.println("It's freezing!");
        } else {
            System.out.println("Bring a seater");
        }
    }
}
