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
public class UnnestedIsElseIfExample {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        int temp = Integer.parseInt(kb.nextLine());

        if (temp < 0) {
            System.out.println("Stay home!");
        } else if ((0 <= temp) && (temp < 32)) {
            System.out.println("It's freezing");
        } else if ((32 <= temp) && (temp < 68)) {
            System.out.println("Bring a sweater");
        } else {
            System.out.println("Nice and warm");
        }
    }
}
