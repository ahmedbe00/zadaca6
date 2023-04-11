package org.ahmedbe00.qamp.zadaci.zadaca6.task1;

public class Main {
    public static void main(String[] args) {

         Bookshelf bookshelf=new Bookshelf();
        Book book=new Book("Ana Karenjina",9788676741779L,"Tolstoj");
        Book book1=new Book("Don Kihot",9785389028005L,"Servantes Migel");

        bookshelf.addBook(book);
        bookshelf.addBook(book1);

        System.out.println(bookshelf.containsBook(9788676741779L));
        System.out.println(bookshelf.containsBook("Vlak u snijegu"));
        bookshelf.printBookshelf();












    }
}
