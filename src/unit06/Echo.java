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
public class Echo {
    public static void main(String[] args) {
        //Create a Scanner
        Scanner kb = new Scanner(System.in);
        //Read a line when the user presses "Enter"
        String line = kb.nextLine();
        //Echo line to the console
        System.out.println("you typed: " + line);
    }
}
