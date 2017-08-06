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
public class ArrayExample {

    public static void main(String[] args) {
        int[] myArray = new int[18];

        myArray[0] = 42;     myArray[4] = -8;
        myArray[1] = 23;     myArray[5] = 15;
        myArray[2] = 19;     myArray[6] = 512;
        myArray[3] = 3;      myArray[7] = -19;
        
        myArray[14] = 98;

        for (int i = 0; i < myArray.length; i++) {
            System.out.println("i:" + i + " myArray[i]:" + myArray[i]);
        }
               
        System.out.println();

        int[] myOtherArray = {-19, 3, 512, 19, 15, 23, -8};
                
        
        for (int i = 0; i < myOtherArray.length; i++) {
            System.out.println("i:" + i + " myOtherArray[i]:" + myOtherArray[i]);
        }
    }
}
