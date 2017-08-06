/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit19;

import java.util.ArrayList;
/**
 *
 * @author tenberge
 */
public class ArrayListStack {
    
    private ArrayList<Integer> al;
    
    public ArrayListStack() {
        al = new ArrayList<Integer>();
    }
    
    public boolean isEmpty() {
     //   return al.isEmpty();
        //alternative
        return al.size() == 0;
    }
    
    public boolean isFull() {
        return false;
    }
    
    public void push(int s) {
        al.add(0, s);
        //alternative
        //al.add(s);
    }
    
    public int pop() {
        return al.remove(0);
        //alternative
      //  return al.remove(al.size()-1);
    }
    
    
    public static void main(String[] args) {
        
        ArrayListStack stack = new ArrayListStack();
        
        //add stuff
        for (int i = 0; i < 5; i++) {
            System.out.println("Pushing " + i);
            stack.push(i);
        }
        
        //read stuff
        while  (!(stack.isEmpty())) {
            System.out.println("Popped " + stack.pop());
        }
    }
}
