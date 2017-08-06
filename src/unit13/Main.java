/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit13;

/**
 *
 * @author Bastian Tenbergen (bastian.tenbergen@oswego.edu)
 */
public class Main {

    public static void main(String[] args) {
        Book b = new Book("Bogenstahl", "Datagrave");
        
        System.out.println(b.getTitle());
        
        System.out.println(b.toString());
    }
}
