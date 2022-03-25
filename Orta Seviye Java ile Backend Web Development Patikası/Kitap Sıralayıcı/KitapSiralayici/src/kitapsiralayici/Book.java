/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kitapsiralayici;

/**
 *
 * @author galileo-onur
 */
public class Book implements Comparable<Book>{
    
    private String bookName;
    private String bookAuthor;
    private int pageCount;
    private int publishYear;

    public Book(String bookName, String bookAuthor, int pageCount, int publishYear) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.pageCount = pageCount;
        this.publishYear = publishYear;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }
    
    
    @Override
    public int compareTo(Book book){
        return this.bookAuthor.compareTo(book.bookAuthor);
    }
    
    
}
