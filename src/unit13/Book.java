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
public class Book {
    
    private String author;
    private String title;
    
    public Book(String a, String title) {
        this.title = title;
        author = a;
    }
    
    public String getAuthor() {
        return this.author;
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public String toString() {
        return this.title + " by " + this.author;
    }
    
    public String printTitleAndAuthor() {
        return this.toString();
    }
}
