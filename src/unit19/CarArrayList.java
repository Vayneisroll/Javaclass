/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit19;

import java.util.Random;
import java.util.Scanner;
import unit05.Car;

/**
 *
 * @author Bastian Tenbergen (bastian.tenbergen@oswego.edu)
 */
public class CarArrayList {

    private Car[] cars1; //this is the one we use to store stuff
    private Car[] cars2; //this is the one we use to resize

    public CarArrayList() {
        cars1 = new Car[1];
    }

    public void add(Car c) {
        //try to add at at a random spot...
        Random r = new Random();
        int randomSpot = r.nextInt(cars1.length);
        this.add(randomSpot, c);
    }

    public void add(int index, Car c) {
        System.out.println("...Checking if the array is too small...");
        if (cars1.length <= index) {
            this.resize(index);
        }

        System.out.println("...Checking if there's already someting at that index...");
        if (cars1[index] != null) {
            System.out.println("...Can't add here. Trying the next spot...");
            index++;
            this.add(index, c);
        } else {
            cars1[index] = c;
            System.out.println("Added the car at position: " + index);
        }
    }

    private void resize(int moreSlots) {
        cars2 = new Car[cars1.length + moreSlots];
        System.out.println("   RESIZING by " + moreSlots + " slots. ArrayList is now this long: " + cars2.length);
        //Copying elements from last array...
        for (int i = 0; i < cars1.length; i++) {
            cars2[i] = cars1[i];
        }
        //Now moving the new array in the place of the old array.
        cars1 = cars2;
    }

    public Car remove(int index) {
        //TRY THIS AT HOME!
        return null;
    }

    public boolean isEmpty() {
        //TRY THIS AT HOME!
        return false;
    }
    
    public boolean isFull() {
        return false;
    }

    public void clear() {
        //TRY THIS AT HOME!
    }

    public int search(Car c) {
        //TRY THIS AT HOME!
        return -1;
    }

    public static void main(String[] args) {

        CarArrayList carArrayList = new CarArrayList();

        Scanner kb = new Scanner(System.in);
        String line = "";
        boolean keepGoing = true;
        Random r = new Random();
        double price;

        do {
            System.out.println("Enter a Car:");
            line = kb.nextLine();

            if (line.equals("q")) {
                keepGoing = false;
            } else {

                price = r.nextInt(42000) + r.nextFloat();
                Car newCar = new Car(line, price);

                int tryToAddHere = r.nextInt(2);
                carArrayList.add(tryToAddHere, newCar);
            }
        } while (keepGoing);
    }
}
