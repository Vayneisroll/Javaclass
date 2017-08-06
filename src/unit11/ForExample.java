/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit11;

/**
 *
 * @author Bastian Tenbergen (bastian.tenbergen@oswego.edu)
 */
public class ForExample {

    public static void main(String[] args) {

   //     int i = 0;
        
        for (int i = 0; i <= 42; i++) {
            System.out.println("Count: " + i);
        }

        for (int i = 42; i <= 0; i--) {
            System.out.println("Count: " + i);
        }

   //     System.out.println(i);
    }
}
