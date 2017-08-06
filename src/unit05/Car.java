/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package unit05;

/**
 *
 * @author Bastian Tenbergen (bastian.tenbergen@oswego.edu)
 */
public class Car {

    public String model;
    public double price;
    
    public Car() {
    
    }
    
    public Car(String m, double p) {
        model = m;
        price = p;
    }
    
    public static void main(String[] args) {
        
       Car frank = new Car("Stingray", 20000); 
       System.out.println("The following car was created: " + frank.price);
       
       Car car1 = new Car("Mustang", 10);
       System.out.println("Yay! Another car! Model: " + car1.model + ", Price: " + car1.price);
       
       Car car2 = new Car("BMW", 42);
       System.out.println("Yay! Another car! Model: " + car2.model + ", Price: " + car2.price);
       
       Car car3 = new Car(car1.model, car1.price);
       System.out.println("Yay! Another car! Model: " + car3.model + ", Price: " + car3.price);
       
       car1.model = car2.model;
       car1.price = car2.price;
       System.out.println("Yay! Another car! Model: " + car1.model + ", Price: " + car1.price);
       
    }
}
