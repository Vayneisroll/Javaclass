/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package unit14;

import java.util.Random;
/**
 *
 * @author Bastian Tenbergen (bastian.tenbergen@oswego.edu)
 */
public class RandomTest {

    public static void main(String[] args) {
        Random r = new Random();
        
        int value = r.nextInt();
        
        System.out.println("Value: " + value);
        System.out.println("Value max 5: " + r.nextInt(6));
        System.out.println("A decimal value: " + r.nextFloat());
        System.out.println("Number between 40 and 52: " + (r.nextInt(11) + r.nextFloat() + 40));
    }
}
