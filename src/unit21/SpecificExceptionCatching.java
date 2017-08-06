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
public class SpecificExceptionCatching {
    public static void main(String[] args) {
        
        int[] array = {1, 2, 3, 4, 5};
        boolean foo = true;
        
        if (foo) array = null;

        try {
            
            array[-2] = 42;
            
   //  uncoment these lines to see what Netbeans thinks about Exception catching order
   //     } catch (RuntimeException e) {
   //         System.out.println("An Exception occurred! " + e.toString());
        } catch (ArrayIndexOutOfBoundsException e) {
           System.out.println("An Exception occurred! " + e.toString());
        } catch (NullPointerException e) {
            System.out.println("blech");
        } catch (Exception e) {
            System.out.println("generic exception");
        }
        
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
