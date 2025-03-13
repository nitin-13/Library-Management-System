package com.librarymanagement;

import java.util.Scanner;

public class LibrarySystem {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner in = new Scanner(System.in);

        //Adding books to library
        library.addBook(new Book("111","Programming with Java","Java Man"));
        library.addBook(new Book("222","Programming with C","C Man"));
        library.addBook(new Book("333","Programming with C++","C++ Man"));
        library.addBook(new Book("444","Programming with Python","Python Man"));

        //Adding members to library
        library.addMember(new Member(1,"Ram"));
        library.addMember(new Member(2,"Shaam"));
        library.addMember(new Member(3,"Ramesh"));
        library.addMember(new Member(4,"Suresh"));

        while (true){
            System.out.println("Welcome to the library :\n");
            System.out.println("1. Borrow a Book");
            System.out.println("2. Return a Book");
            System.out.println("3. Display Available Books");
            System.out.println("4. Display Borrowed Books");
            System.out.println("5. Exit\n");
            System.out.print("Enter your choice -> ");

            int choice = in.nextInt();
            switch (choice){
                case 1:
                    System.out.print("Enter Member ID -> ");
                    int memberId = in.nextInt();
                    in.nextLine();
                    System.out.print("Enter ISBN -> ");
                    String isbn = in.nextLine();
                    library.borrowBook(memberId, isbn);
                    break;
                case 2:
                    System.out.print("Enter Member ID -> ");
                    memberId = in.nextInt();
                    in.nextLine();
                    System.out.print("Enter ISBN -> ");
                    isbn = in.nextLine();
                    library.returnBook(memberId, isbn);
                    break;
                case 3:
                    library.displayAvailableBooks();
                    break;
                case 4:
                    library.displayBorrowedBooks();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    in.close();
                    return;
                default:
                    System.out.println("Invalid Choice. Please try again.");
            }
        }
    }
}