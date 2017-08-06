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
public class NestedIfExample {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Please enter a month as a number:");
        int month = Integer.parseInt(kb.nextLine());

        if (month == 1) {
            System.out.println("It's January!");
        } else {
            if (month == 2) {
                System.out.println("It's February!");
            } else {
                if (month == 3) {
                    System.out.println("It's March!");
                } else {
                    if (month == 4) {
                        System.out.println("It's April!");
                    } else {
                        if (month == 5) {
                            System.out.println("It's May!");
                        } else {
                            if (month == 6) {
                                System.out.println("It's June!");
                            } else {
                                if (month == 7) {
                                    System.out.println("It's July!");
                                } else {
                                    if (month == 8) {
                                        System.out.println("It's August!");
                                    } else {
                                        if (month == 9) {
                                            System.out.println("It's September!");
                                        } else {
                                            if (month == 10) {
                                                System.out.println("It's October!");
                                            } else {
                                                if (month == 11) {
                                                    System.out.println("It's November!");
                                                } else {
                                                    if (month == 12) {
                                                        System.out.println("It's December!");
                                                    } else {
                                                        System.out.println("That's not a valid month.");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
