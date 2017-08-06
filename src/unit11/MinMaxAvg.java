/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit11;

import java.util.Scanner;
/**
 *
 * @author tenberge
 */
public class MinMaxAvg {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int userValue;
        int max = 0, min = 0;
        double avg;
        int sum = 0;
        
        for (int i = 1; i <= 5; i++) {
            System.out.println("Please enter value " + i);
            userValue = Integer.parseInt(kb.nextLine());
            
            sum = sum + userValue;
            
            if (userValue > max) {
                max = userValue;
            } else {
                //do nothing
            }
            
            if (userValue < min) {
                min = userValue;
            }
            
            avg = sum / i;
            
            System.out.println("Minimum: " + min);
            System.out.println("Maximum: " + max);
            System.out.println("Avergage: " + avg);
        }

    }
}