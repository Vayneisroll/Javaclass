/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit15;

import java.util.Random;

/**
 *
 * @author tenberge
 */
public class MultiDimensionalArray {

    public static void main(String[] args) {
        int[] oneDimension = new int[5];
        int[][] twoDimensions = new int[7][5];
        int[][][] threeDimensions = new int[5][7][8];

        Random r = new Random();

        for (int i = 0; i < oneDimension.length; i++) {
            oneDimension[i] = r.nextInt(50);
        }

        System.out.println("Contents of array 'oneDimension':");
        for (int i = 0; i < oneDimension.length; i++) {
            System.out.printf("%5d", oneDimension[i]);
        }
        System.out.println("\n");

       for (int i = 0; i < twoDimensions.length; i++) {
            for (int j = 0; j < twoDimensions[i].length; j++) {
                twoDimensions[i][j] = r.nextInt(50);
            }
        }

        System.out.println("Contents of array 'twoDimensions':");
        for (int i = 0; i < twoDimensions.length; i++) {
            for (int j = 0; j < twoDimensions[i].length; j++) {
                System.out.printf("%5d", twoDimensions[i][j]);
            }
            System.out.println();
        }
        System.out.println("\n");

        
        for (int i = 0; i < threeDimensions.length; i++) {
            for (int j = 0; j < threeDimensions[i].length; j++) {
                for (int k = 0; k < threeDimensions[i][j].length; k++) {
                    threeDimensions[i][j][k] = r.nextInt(50);
                }
            }
        }

        System.out.println("Contents of array 'threeDimensions':");
        for (int i = 0; i < threeDimensions.length; i++) {
            for (int j = 0; j < threeDimensions[i].length; j++) {
                for (int k = 0; k < threeDimensions[i][j].length; k++) {
                    System.out.printf("%5d", threeDimensions[i][j][k]);
                  //  System.out.println(threeDimensions[i][j][k]);
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("\n");
    }
}
