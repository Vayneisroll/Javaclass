/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit16;

/**
 *
 * @author tenberge
 */
public class StudentQuizScores {

    public static void main(String[] args) {

        //this is the old array
        int[][] studentScores
                = {
                    {82, 87, 85, 85, 91},
                    {76, 78, 82, 88, 100},
                    {88, 82, 42, 22, 13}
                };

        //print the old array
        for (int i = 0; i < studentScores.length; i++) {
            for (int j = 0; j < studentScores[i].length; j++) {
                System.out.printf("%5d", studentScores[i][j]);
            }   // the line above formats the array nicely
            System.out.println();
        }
        System.out.println("\n");

        int[][] studentScoresAvg = new int[studentScores.length + 1][studentScores[0].length + 1];
        int studAvg = 0;
        int[] quizAvg = new int[studentScores[0].length];

        for (int i = 0; i < studentScores.length; i++) {
            for (int j = 0; j < studentScores[i].length; j++) {
                studentScoresAvg[i][j] = studentScores[i][j];

                studAvg = studAvg + studentScores[i][j];
                quizAvg[j] = quizAvg[j] + studentScores[i][j];

            }
            studAvg = studAvg / studentScores[i].length;
            studentScoresAvg[i][studentScores[0].length] = studAvg;
            studAvg = 0;
        }

        for (int j = 0; j < quizAvg.length; j++) {
            quizAvg[j] = quizAvg[j] / studentScores.length;
            studentScoresAvg[studentScoresAvg.length-1][j] = quizAvg[j];
        }
        
        
        for (int i = 0; i < studentScoresAvg.length; i++) {
            for (int j = 0; j < studentScoresAvg[i].length; j++) {
                System.out.printf("%5d", studentScoresAvg[i][j]);
            }
            System.out.println();
        }

    }
}
