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
public class IfAndExample {
    public static void main(String[] args) {
        
        Scanner kb = new Scanner(System.in);
        
        System.out.println("Enter a Number between 5 and 10");
        int num = Integer.parseInt(kb.nextLine());
        if (num >= 5) {
            if (num <= 10) {
                System.out.println("The number is between 5 and 10!");
            } else {
                System.out.println("The number is larger than 10!");
            }
        } else {
            System.out.println("The number is smaller than 5");
        }
        
        System.out.println("##########");
        System.out.println("Enter a Number between 50 and 100");
        num = Integer.parseInt(kb.nextLine());
        if (num >= 50 && num <= 100) {
            System.out.println("The number is between 50 and 100!");
        } else if (num > 100) {
            System.out.println("The number is larger than 100!");
        } else {
            System.out.println("The number is smaller than 50");
        }
    }
}
