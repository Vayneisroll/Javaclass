/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package unit14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 *
 * @author Bastian Tenbergen (bastian.tenbergen@oswego.edu)
 */
public class ScannerDemo {

    public static void main(String[] args) throws FileNotFoundException {
     
        //use a scanner to read from the keyboard
        Scanner kb = new Scanner(System.in);
        System.out.println("Type something, please!");
        String userString = kb.nextLine();
        System.out.print("Reverse order: ");
        char[] letters = userString.toCharArray();
        for (int i = letters.length-1; i >= 0; i--) {
            System.out.print(letters[i]);
        }
        System.out.println("\n");
        
        System.out.println("Enter a filename:");
        userString = kb.nextLine();
        
        //use a scanner to read a file
        File f = new File(userString);
        Scanner fileScanner = new Scanner(f);
        while (fileScanner.hasNextLine()) {
            System.out.println(fileScanner.nextLine());
        }
        
        //user a scanner to scan individual string!
        System.out.println("Enter some string");
        userString = kb.nextLine();
        Scanner lineScanner = new Scanner(userString);
        lineScanner.useDelimiter("-");
        
        
        while (lineScanner.hasNext()) {
            System.out.println(lineScanner.next());
        }
    }
}
