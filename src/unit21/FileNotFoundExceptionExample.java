/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit21;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

/**
 *
 * @author tenberge
 */
public class FileNotFoundExceptionExample {

    public static void main(String[] args) throws Exception {

        boolean fileFound = false;
        File f;
        
        try {
            f = new File("build.xml");
            Scanner sc = new Scanner(f);
            fileFound = true;
            
        } catch (FileNotFoundException e) {
            fileFound = false;
        } finally {
            f = null;
        }
        
        System.out.println(fileFound);
    }
}
