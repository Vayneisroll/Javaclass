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
public class IntStack {

    private int[] values;
    private int top;

    //create a new stack
    public IntStack(int size) {

        values = new int[size];
        top = -1;
    }

    public boolean isFull() {
        if (top == values.length - 1) {
            return true;
        } else {
            return false;
        }
    }

    //add elements to the top of the stack
    public void push(int n) {
        if (!this.isFull()) {
            top++;
            values[top] = n;
        } else {
            
        }
    }

    //look at the top element
    public int peek() {
        return values[top];
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        }
        else return false;
    }

    //remove elements from the top of the stack
    public int pop() {
        if (!this.isEmpty()) {
            int temp = this.peek();
            top--;
            return temp;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        IntStack stack = new IntStack(5);

        //add stuff
        while (!stack.isFull()) {
            int number = Integer.parseInt(kb.nextLine());
            System.out.println("Pushing " + number);
            stack.push(number);

            System.out.println("Top element: " + stack.peek());
        }

        while (!stack.isEmpty()) {
            System.out.println("Popping: " + stack.pop());
        }
    }
}
