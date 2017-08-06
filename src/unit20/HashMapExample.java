/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
/**
 *
 * @author tenberge
 */
public class HashMapExample {
    public static void main(String[] args) {
        Random r = new Random();
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        
        for (int i = 0; i < 50; i++) {
            System.out.println("Adding Truck # " + i);
            hm.put(i, "Truck # " + i);
        }
        
        while (!hm.isEmpty()) {
            int randomKey = r.nextInt(50);   // get a random key
            System.out.println("Removing " + hm.remove(randomKey));
            // the line above will retrieve null if a random key is generated
            // that has been removed in a previous iteration
        }
    }
}
