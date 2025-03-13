package com.librarymanagement;

import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> books;
    List<Member> members;

    public Library(){
        this.books = new ArrayList<>();
        this.members =  new ArrayList<>();
    }

    public void addBook(Book book){
        this.books.add(book);
    }

    public void addMember(Member member){
        this.members.add(member);
    }

    public Book findBook(String isbn){
        for(Book book : books){
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }

    public Member findMember(int memberId){
        for(Member member : members){
            if (member.getMemberId() == memberId) {
                return member;
            }
        }
        return null;
    }

    public void borrowBook(int memberId, String isbn){
        Member member = findMember(memberId);
        Book book = findBook(isbn);

        if(member != null && book != null && (!book.isBorrowed())){
            book.borrowBook();
            member.borrowBook(book);
            System.out.println("Book borrowed successfully");
            System.out.println("INFO: "+member.getMemberName()+" borrowed "+book.getBookName());
        }
        else {
            System.out.println("Book not available OR Member not found");
        }
    }

    public void returnBook(int memberId, String isbn){
        Member member = findMember(memberId);
        Book book = findBook(isbn);

        if(member != null && book != null && book.isBorrowed()){
            book.returnBook();
            member.returnBook(book);
            System.out.println("Book returned successfully");
            System.out.println("INFO: "+member.getMemberName()+" returned "+book.getBookName());
        }
        else {
            System.out.println("Book not borrowed OR Member not found");
        }
    }

    public void displayAvailableBooks() {
        System.out.println("Available Books:");
        for (Book book : books) {
            if (!book.isBorrowed()) {
                System.out.println(book);
            }
        }
    }

    public void displayBorrowedBooks() {
        System.out.println("Borrowed Books:");
        for (Book book : books) {
            if (book.isBorrowed()) {
                System.out.println(book);
            }
        }
    }
}