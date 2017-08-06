/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package unit21;

/**
 *
 * @author Bastian Tenbergen (bastian.tenbergen@oswego.edu)
 */
public class NoExceptionExample {
    
    public static void main(String[] args) {
        String[] myArray = new String[10];
        String bla = null;
        
        System.out.println(myArray.length);
        System.out.println(myArray[5]);
        System.out.println(bla.length());

        System.out.println("After the exception...");
    }
}
