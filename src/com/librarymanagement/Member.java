package com.librarymanagement;
import java.util.List;
import java.util.ArrayList;

public class Member {
    private int memberId;
    private String memberName;
    private List<Book> borrowedBooks;

    public Member(int memberId,String memberName){
        this.memberId = memberId;
        this.memberName = memberName;
        this.borrowedBooks = new ArrayList<>();
    }


    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void borrowBook(Book book){
        this.borrowedBooks.add(book);
    }

    public void returnBook(Book book){
        this.borrowedBooks.remove(book);
    }

    @Override
    public String toString() {
        return "Member ID: " + getMemberId() + ", Name: " + getMemberName() + ", No. of Books Borrowed: " + borrowedBooks.size();
    }
}