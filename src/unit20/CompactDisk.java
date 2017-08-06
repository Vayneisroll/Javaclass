/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit20;

import java.util.HashMap;
import java.util.Scanner;
/**
 *
 * @author tenberge
 */
public class CompactDisk {
    private String upc, price, artist, title;
    
    public CompactDisk(String u, String p, String a, String t) {
        upc = u;
        price = p;
        artist = a;
        title = t;
    }
    
    public String toString() {
        return "Artist: " + artist + " Title: " + title + " Price: " + price;
    }
    
    public static void main(String[] args) {
        HashMap<String, CompactDisk> hm = new HashMap<String, CompactDisk>();
        Scanner kb = new Scanner(System.in);
        String upc = "";
        
        for (int i = 1; i <= 3; i++) {
            System.out.println("Please enter the info of CD" + i);
            upc = kb.next();
            CompactDisk cd = new CompactDisk(upc, kb.next(), kb.next(), kb.nextLine());
            hm.put(upc, cd);
            
        }
        
        do {
            System.out.println("Enter some UPC:");
            upc = kb.nextLine();
            System.out.println("The CD is: " + hm.get(upc));
        }  while (!upc.equals("quit"));
    }
    
}
