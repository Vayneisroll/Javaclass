/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package unit17;

import java.util.Scanner;

/**
 *
 * @author Bastian Tenbergen (bastian.tenbergen@oswego.edu)
 */
public class StackCalculator {

    public static void main(String[] args) {

        IntStack calc = new IntStack(10);
        Scanner kb = new Scanner(System.in);
        String line = "";
        
        do {
            System.out.println("Please enter a number or an operator: ");
            line = kb.nextLine();
            
            if (line.equals("+")) {
                
                int op1 = calc.pop();
                int op2 = calc.pop();
                int result = op1 + op2;
                calc.push(result);
                
            } else if (line.equals("*")) {
                
                // do this by yourself!
                
            } else if (line.equals("-")) {
                
                // do this by yourself!
            
            } else if (line.equals("/")) {
                
                // do this by yourself!
                
            } else if (line.equals("=")) {
                
                int result = calc.pop();
                calc.push(result);
                System.out.println(result);
                
            } else if(line.equals("q")) {
                
                break; 
                
            } else {
                int op1 = Integer.parseInt(line);
                calc.push(op1);
            }
            
        } while (!line.equals("q"));
    }
}
