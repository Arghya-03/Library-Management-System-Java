package library;

import java.util.ArrayList;
// ✅ ADD THIS LINE
import library.Book;

public class Library {

    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully.");
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        System.out.println("ID\tTitle\tAuthor\tStatus");
        for (Book book : books) {
            book.displayBook();
        }
    }

    public void issueBook(int id) {
        for (Book book : books) {
            if (book.getBookId() == id) {
                if (!book.isIssued()) {
                    book.issueBook();
                    System.out.println("Book issued successfully.");
                } else {
                    System.out.println("Book already issued.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void returnBook(int id) {
        for (Book book : books) {
            if (book.getBookId() == id) {
                if (book.isIssued()) {
                    book.returnBook();
                    System.out.println("Book returned successfully.");
                } else {
                    System.out.println("Book was not issued.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void searchBook(int id) {
        for (Book book : books) {
            if (book.getBookId() == id) {
                System.out.println("Book found:");
                System.out.println("ID\tTitle\tAuthor\tStatus");
                book.displayBook();
                return;
            }
        }
        System.out.println("Book not found.");
    }
}
