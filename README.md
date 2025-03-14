# Library Management System

## *This project will demonstrate -*

- #### Encapsulation: Hiding data and methods within classes.
- #### Abstraction: Defining abstract classes or interfaces for common behavior.

### *Project Structure -*
```
├── src/  
│ ├── com/   
│ │ └── librarymanagement/      
│ │ &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── Book.java  
│ │ &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── Member.java  
│ │ &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── Library.java  
│ │ &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── LibrarySystem.java  
```
#### Core Classes:

- Book:  
   Attributes: isbn, title, author, isBorrowed.  
   Methods: Constructor, getters, setters, borrowBook(), returnBook().

- Member:  
Attributes: memberId, name, borrowedBooks (List of Book objects).  
Methods: Constructor, getters, setters, borrowBook(Book book), returnBook(Book book).

- Library:  
Attributes: books (List of Book objects), members (List of Member objects).  
Methods: addBook(Book book), addMember(Member member), findBook(String isbn), findMember(int memberId), borrowBook(int memberId, String isbn), returnBook(int memberId, String isbn), displayAvailableBooks(), displayBorrowedBooks().

- LibrarySystem:  
Main class to drive the application, handle user input from console, and interact with Library, Book, and Member objects.
Main class to drive the application, handle user input from console, and interact with Library, Book, and Member objects.

## How to Compile and Run:

- Navigate to the Library-Management-System/src directory using your terminal or command prompt. - Compile the Java files:
- javac Book.java Member.java Library.java LibrarySystem.java
- This will create .class files in the same directory.
- Run the LibrarySystem class:
- java LibrarySystem


### If you are using an IDE such as IntelliJ or Eclipse:  
- Create a new java project.
- Create a src folder.
- Copy the java files into the src folder.
- The IDE will handle the compiling and running of the program.
