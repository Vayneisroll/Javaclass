/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit13;

/**
 *
 * @author tenberge
 */
public class Library {
    
    Book[] books;
    
    public Library(int size) {
        
        books = new Book[size];
    }
    
    public void addBook(String t, String a) {
        Book b = new Book(t, a);
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = b;
                break;
            }
        }
    }
    
    public Book findBook(String title) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getTitle().equals(title)) {
                return books[i];
            } 
        }
        return null;
    }
    
    public void showBook() {
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);
        }
    }
}
