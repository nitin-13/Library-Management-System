package com.librarymanagement;

public class Book  {

    private String isbn;
    private String bookName;
    private String author;
    private boolean isBorrowed;

    public Book(String isbn,String bookName,String author){
        this.isbn = isbn;
        this.bookName = bookName;
        this.author = author;
        this.isBorrowed = false;
    }


    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void borrowBook(){
        isBorrowed = true;
    }

    public void returnBook(){
        isBorrowed=false;
    }

    @Override
    public String toString() {
        return "ISBN: " + isbn + ", Title: " + getBookName() + ", Author: " + getAuthor() + ", Borrowed: " + isBorrowed();
    }


}