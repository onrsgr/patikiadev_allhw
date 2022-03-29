/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package booklist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author onur
 */
public class BookList {

    public static void main(String[] args) {
        
        List<Book> bookList = new ArrayList<>();
        
        bookList.add(new Book("Book1","Author1",99,1999));
        bookList.add(new Book("Book2","Author2",354,2017));
        bookList.add(new Book("Book3","Author3",85,2020));
        bookList.add(new Book("Book4","Author4",1194,1987));
        bookList.add(new Book("Book5","Author5",185,1975));
        bookList.add(new Book("Book6","Author6",654,1955));
        bookList.add(new Book("Book7","Author7",658,2018));
        bookList.add(new Book("Book8","Author8",251,1990));
        bookList.add(new Book("Book9","Author9",498,1995));
        bookList.add(new Book("Book10","Author10",314,2002));
        
        // List to Map
        Map<String, String> mappedBook = new HashMap<>();
        mappedBook = bookList.stream().collect(
                Collectors.toMap(Book::getBookName, Book::getBookAuthor));       
        
        System.out.println(mappedBook);
        
        // Filter Map if Page Number Greater Than 100
        
        List<Book> filteredBookList = new ArrayList<>();
        filteredBookList = bookList.stream().filter(book -> book.getPageCount()>100).collect(Collectors.toList());
        
        System.out.println(filteredBookList);
    }
    
}
