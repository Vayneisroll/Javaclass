/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit16;

import java.util.Scanner;
/**
 *
 * @author tenberge
 */
public class BunnyGame {

    private String[][] field;

    public BunnyGame(int x, int y) {
        this.field = new String[x][y];
        
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                field[i][j] = "| x ";
            }
            //adds a breakline after each row to create the columns
            System.out.println();
        }
    }
    
    public void hop(int x, int y) {
        if (x < 0 || x >= field.length || y < 0 || y >= field[0].length) {
            System.out.println("  Sorry, bunny can't hop there. Try again!");
        } else {
            field[x][y] = "| D ";
            printField();
        }
    }

    public void printField() {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                //formats the slots nicely
                System.out.print(field[i][j]);
            }
            //adds a breakline after each row to create the columns
            System.out.println("|");
        }
    }

    public static void main(String[] args) {

        BunnyGame bg = new BunnyGame(10, 10);
        System.out.println("Yay! The Bunny Game!");
        bg.printField();
        
        String command = "";
        do {
            System.out.println("\nWhere does the bunny hop?");
            Scanner kb = new Scanner(System.in);
            command = kb.nextLine();
            if (!command.equals("quit")) {
                String[] coords = command.split(" ");
                int x = Integer.parseInt(coords[0]);
                int y = Integer.parseInt(coords[1]);
                bg.hop(x, y);
            } else {
                System.out.println("\nBunny says \"Bye, Bye\"");
            }
            
        } while (!command.equals("quit"));
    }
}
