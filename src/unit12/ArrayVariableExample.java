/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit12;

/**
 *
 * @author tenberge
 */
public class ArrayVariableExample {
    public static void main(String[] args) {
        
        int arraySize = 42000;      //this example just shows that you can
                                    //also use a variable to initialize an array!
        
        int[] frank = new int[arraySize];
        
        for (int i = 0; i < frank.length; i++) {
            System.out.println("i: " + i + ", array: " + frank[i]);
        }
    }
}
