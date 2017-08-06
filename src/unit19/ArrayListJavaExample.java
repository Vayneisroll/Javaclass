/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit19;

import unit05.Car;
import java.util.ArrayList;
/**
 *
 * @author tenberge
 */
public class ArrayListJavaExample {

    public static void main(String[] args) {
        
        ArrayList<Car> al = new ArrayList<Car>();
        
        for (int i = 0; i < 5; i++) {
            al.add(new Car());
        }
        
        System.out.println(al.size());
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Removing " + al.remove(0));
        }
        
        al.remove(0);
    }
}
