/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit10;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 *
 * @author tenberge
 */
public class WhileExample2 {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("csc212names17s.csv");
        
        Scanner fileScanner = new Scanner(file);

        int lineCount = 0;

        while (fileScanner.hasNext()) {
            lineCount++;    //lineCount = lineCount + 1;
            System.out.println("Stundent number " + lineCount + " is: " + fileScanner.nextLine());
        }
    }
}
