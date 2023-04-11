package org.ahmedbe00.qamp.zadaci.zadaca6.task1;

import java.util.ArrayList;
import java.util.List;

public class Bookshelf {
    private List<Book> booksList;
    public Bookshelf() {
       this.booksList = new ArrayList<>();
    }
    public void addBook(Book book) {
        this.booksList.add(book);
    }
    public boolean containsBook(String title) {
        for (Book book : booksList) {
            if (book.getTitle().equals(title)) {
                return true;
            }
        }
        return false;
    }
    public boolean containsBook(long ISBN) {
        for (Book book : booksList) {
            if (book.getTitle().equals(ISBN)) {
                return true;
            }
        }
        return false;
    }
        public void printBookshelf(){
            System.out.println("The books we have : ");
            for (Book books : booksList) {
                System.out.println(books);
            }
        }

    }
