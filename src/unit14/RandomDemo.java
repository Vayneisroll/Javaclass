/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit14;

import java.util.Random;
/**
 *
 * @author tenberge
 */
public class RandomDemo {

    public static void main(String[] args) {

        Random r = new Random();
 
        int value = r.nextInt();
        System.out.println(value);
        
        float v2 = r.nextInt(43) + r.nextFloat();
        System.out.println(r.nextInt(43));
        System.out.println(r.nextFloat());
        System.out.println(v2);
        
    }

}
