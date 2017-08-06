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
public class ConsumerPriceIndex {

    public static void main(String[] args) {
        System.out.println("Please enter a year between 1983 and 2006:");
        Scanner kb = new Scanner(System.in);
        int year = Integer.parseInt(kb.nextLine());
        double cpi = 4.434 * year - 8694.6;
        System.out.println("The Consumer Price Index for the year " + year + " is " + cpi);
    }
}
