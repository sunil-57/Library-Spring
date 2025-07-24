package com.summer.models;

import jakarta.persistence.*;

@Entity
@Table(name = "book")
public class Book{
    //attributes ->book number, nam, quantity, author
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookId;

    private int bookNumber;
    private String bookName;
    private int bookQuantity;
    private String authorName;

    public Book(){}

    public Book(int bookid, int bookNumber, String bookName, int bookQuantity, String bookAuthor){
        this.bookId = bookid;
        this.bookNumber = bookNumber;
        this.bookName = bookName;
        this.bookQuantity = bookQuantity;
        this.authorName = authorName;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getBookNumber() {
        return bookNumber;
    }

    public void setBookNumber(int bookNumber) {
        this.bookNumber = bookNumber;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookQuantity() {
        return bookQuantity;
    }

    public void setBookQuantity(int bookQuantity) {
        this.bookQuantity = bookQuantity;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    //behaviour -> increase quantity, decrease quantity
    public void increaseQuantity(){
        this.bookQuantity++;
    }
    public void decreaseQuantity(){
        this.bookQuantity--;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookNumber=" + bookNumber +
                ", bookName='" + bookName + '\'' +
                ", bookQuantity=" + bookQuantity +
                ", authorName='" + authorName + '\'' +
                '}';
    }
}
