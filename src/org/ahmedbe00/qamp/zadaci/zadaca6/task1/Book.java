package org.ahmedbe00.qamp.zadaci.zadaca6.task1;

public class Book {

    private String title;
    private long ISBN;
    private String author;

    public Book(String title, long ISBN,String author) {
        this.title = title;
        this.ISBN = ISBN;
        this.author = author;
    }
    public String getTitle() {
        return this.title;
    }

    public long getISBN() {
        return  this.ISBN;
    }


@Override
    public String toString() {
        return title + ", " + author + " (" + ISBN + ")";
    }
}

