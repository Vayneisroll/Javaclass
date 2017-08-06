/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit18;

/**
 *
 * @author tenberge
 */
public class StringQueue {

    String[] values; 
    int numItems;    // keep track of how many items we have

    // constructor
    public StringQueue(int size) {
        // initialize everything
        values = new String[size];
        //no items in queue
        numItems = 0;
    }

    // check if empty
    public boolean isEmpty() {
        // queue is empty when there are zero items in it
        return numItems == 0;
    }

    // check if full
    public boolean isFull() {
        // queue is full when the number of items matches the number of elements in array
        // careful! a stack looks at the position... but a queue looks at how many items are there
        return numItems == values.length;
    }

    // add elements
    public void enqueue(String n) {
        if (!this.isFull()) {
            //put item in front
            values[numItems] = n;
            // increase number of items
            numItems++;
        }
    }
    
    public String dequeue() {
        if (!this.isEmpty()) {
            //get the value
            //always uses the first index!!
            String val =  values[0];
            //adjust the index
            numItems--;
            //now SHIFT THE VALUES!
            this.shift();
            //return it
            return val;
        } else {
            //return null if stack is empty
            return null;
        }
    }
    
    //SHIFT THE VALUES!!!
    private void shift() {
        for (int i = 0; i < numItems; i++) {
            values[i] = values[i+1];
        }
        
    }
    
    public static void main(String[] args) {
        StringQueue queue = new StringQueue(5);
        
        //add stuff+
        int i = 1;
        while (!queue.isFull()) {
            System.out.println("Enqueuing Truck # " + i);
            queue.enqueue(String.valueOf(i));
            i++;
        }
        
        //read stuff
        while  (!(queue.isEmpty())) {
            System.out.println("Dequeueing Truck # " + queue.dequeue());
        }
        
        //try one more time
  //      System.out.println("Dequeueing Truck #  " + queue.dequeue());
    }
}
