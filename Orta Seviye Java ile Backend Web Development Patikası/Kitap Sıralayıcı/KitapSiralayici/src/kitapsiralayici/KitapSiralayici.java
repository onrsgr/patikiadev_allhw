/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kitapsiralayici;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author onur-sagir
 */
public class KitapSiralayici {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Book book1 = new Book("Deneme Kitap", "Patika", 55, 1990);
        Book book2 = new Book("İsimli Kitap", "Onur", 188, 1951);
        Book book3 = new Book("Test Kitap", "Dev", 2587, 2017);
        Book book4 = new Book("Asıl Kitap", "Java", 587, 2022);
        Book book5 = new Book("Yedek Kitap", "Proje", 588, 2011);

        Set<Book> allBooks = new HashSet<Book>();

        allBooks.add(book1);
        allBooks.add(book2);
        allBooks.add(book3);
        allBooks.add(book4);
        allBooks.add(book5);

        for (Book book : allBooks) {
            System.out.println("Book Name : " + book.getBookName());
        }
        
        System.out.println("**************************");
        
        
        TreeSet<Book> bookPageSorted = new TreeSet<>((Book bookFirst, Book bookSecond) -> bookFirst.getPageCount() - bookSecond.getPageCount());
        
        bookPageSorted.add(book1);
        bookPageSorted.add(book2);
        bookPageSorted.add(book3);
        bookPageSorted.add(book4);
        bookPageSorted.add(book5);

        
        for (Book book : bookPageSorted) {
            System.out.println(book.getBookName() + " PAGE : " + book.getPageCount());
        }
        
    }

}
