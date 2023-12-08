package edu.traning.lesson14.Book;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();

    public Library(){

    }

    public void add(Book book){
        books.add(book);
    }

    public void printBooksByAuthor(String author) {
        List<Book> result = new ArrayList<>();

        for (int i = 0; i < books.size(); i++) {
            Book temp = books.get(i);

            if (temp.getAuthor().equals(author)) {
                result.add(temp);
            }
        }

        for (Book book: result) {
            System.out.println(book.toString());
        }
    }

    public void printBooksByPublishingHouse(String publishingHouse) {
        List<Book> result = new ArrayList<>();

        for (int i = 0; i < books.size(); i++) {
            Book temp = books.get(i);

            if (temp.getPublishingHouse().equals(publishingHouse)) {
                result.add(temp);
            }
        }

        for (Book book: result) {
            System.out.println(book.toString());
        }
    }

    public void printBooksReleasedAfterAGivenYear(int year) {
        List<Book> result = new ArrayList<>();

        for (int i = 0; i < books.size(); i++) {
            Book temp = books.get(i);

            if (temp.getYearOfPublication() > year) {
                result.add(temp);
            }
        }

        for (Book book: result) {
            System.out.println(book.toString());
        }
    }
}
