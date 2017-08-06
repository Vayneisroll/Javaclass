/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit20;

import java.util.Random;
/**
 *
 * @author tenberge
 */
public class LargeArrayExample {
    public static void main(String[] args) {
        Random r = new Random();
        
        System.out.print("This is the short array... ");
        int[] x = new int[999];
        
        long start = System.currentTimeMillis();
        for (int i = 0; i < x.length; i++) {
            x[i] = r.nextInt() % r.nextInt();
        }
        
        long end = System.currentTimeMillis();
        System.out.println(" time to access all " + x.length + " Elements: " + (end - start));
        
        ////////////////////////////////////////////////////////////////////////
        
        System.out.print("This is the long  array... ");
        x = new int[99999999];
        
        start = System.currentTimeMillis();
        for (int i = 0; i < x.length; i++) {
            x[i] = r.nextInt() % r.nextInt();
        }
        
        end = System.currentTimeMillis();
        System.out.println(" time to access all " + x.length + " Elements: " + (end - start));
    }
}
