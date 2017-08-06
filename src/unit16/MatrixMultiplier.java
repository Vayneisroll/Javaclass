/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit16;

import java.util.Random;

/**
 *
 * @author tenberge
 */
public class MatrixMultiplier {

    public static void main(String[] args) {
        //let's make some specific matrices
        Random r = new Random();
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] matrix2 = {{7, 8}, {9, 10}, {11, 12}};

        //uncomment the following to make random matrices 
   /*   int rowsAndCols = r.nextInt(6)+1;
         matrix1 = new int[r.nextInt(6)+1][rowsAndCols];
         matrix2 = new int[rowsAndCols][r.nextInt(6)+1];
         matrix1 = fillMatrix(matrix1);
         matrix2 = fillMatrix(matrix2);
  */      
      //print the two arrays
        printMatrix("Matrix 1", matrix1);
        printMatrix("Matrix 2", matrix2);

        //now let's create the result array
        int[][] result = new int[matrix1.length][matrix2[0].length];

        //now to compute the result array...
        for (int i = 0; i < result.length; i++) {  //iterate over the col in result
            for (int j = 0; j < result[i].length; j++) {   //iterate over the rows in result
                for (int k = 0; k < matrix1[i].length; k++) {   //iterate over the rows for matrix 1
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                    //the result at [i][j] is 
                    //the k'th row at the some colum for matrix 1 as in result
                    //multiplied with
                    //the k'th colum at the same row for matrix 2 as in result
                }
            }
        }

        //now print the result
        printMatrix("Result", result);
    }

    public static int[][] fillMatrix(int[][] matrix) {
        Random r = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = r.nextInt(42);
            }
        }
        return matrix;
    }

    public static int[][] printMatrix(String name, int[][] matrix) {
        System.out.println("\n" + name + ": ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%5d", matrix[i][j]);
            }
            System.out.println();
        }

        return matrix;
    }
}
