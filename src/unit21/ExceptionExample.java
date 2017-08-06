/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit21;

/**
 *
 * @author tenberge
 */
public class ExceptionExample {

    public static void main(String[] args) {
        String[] myArray = new String[10];
        String bla = null;
        try {
            System.out.println(myArray.length);
            System.out.println(myArray[-42]);
            System.out.println(bla.length());
        } catch (Exception e) {
           System.out.println("oops");
        //    System.out.println(e);
            e.printStackTrace();
        } 

        System.out.println("After the exception...");
    }

}
