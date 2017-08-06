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
public class StudentQuizScoresWithComments {

    public static void main(String[] args) {

        //this is the old array
        int[][] studentScores  =
            {
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
        
        // now let's make the new array, which is exactly one row and one col larger
        int[][] studentScoresAvg = new int[studentScores.length+1][studentScores[0].length+1];
        int studAvg = 0;
        int[] quizAvg = new int[studentScores[0].length];
        
        //iterate over the quizzes (y axis)
        for (int i = 0; i < studentScores.length; i++) {
            //iterate over the students (x axis)
            for (int j = 0; j < studentScores[i].length; j++) {
                //assign the old values to the new array
                studentScoresAvg[i][j] = studentScores[i][j];
                
                //tally up the sum of the current student's score
                studAvg += studentScoresAvg[i][j];
                //is the same as studAvg = studentScoresAvg[i][j] + studAvg;
                
                //now tally up the score for this quiz
                quizAvg[j] = quizAvg[j] + studentScoresAvg[i][j];

            }
            //now that we're done with the student, compute the student's average
            studAvg /= studentScores[0].length;
            studentScoresAvg[i][studentScores[0].length] = studAvg;
            //reset the average to be ready for the next student
            studAvg = 0;
        }
        
        //now that we're done with all students and quizzes,
        //compute the average for each quiz
        for (int j = 0; j < quizAvg.length; j++) {
            quizAvg[j] = quizAvg[j] / studentScores.length;
            studentScoresAvg[studentScores.length][j] = quizAvg[j];
        }
               
        
        //print the new array
        for (int i = 0; i < studentScoresAvg.length; i++) {
            for (int j = 0; j < studentScoresAvg[i].length; j++) {
                System.out.printf("%5d", studentScoresAvg[i][j]);
            }
            System.out.println();
        }
        System.out.println("\n");
    }
}
