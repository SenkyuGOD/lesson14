package edu.traning.lesson14.book;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();

    public Library(){

    }

    public void add(Book book){
        books.add(book);
    }

    public List<Book> findBooksByAuthor(String author) {
        List<Book> result = new ArrayList<>();

        for (int i = 0; i < books.size(); i++) {
            Book temp = books.get(i);

            if (temp.getAuthor().equals(author)) {
                result.add(temp);
            }
        }
        return result;
    }

    public List<Book> findBooksByPublishingHouse(String publishingHouse) {
        List<Book> result = new ArrayList<>();

        for (int i = 0; i < books.size(); i++) {
            Book temp = books.get(i);

            if (temp.getPublishingHouse().equals(publishingHouse)) {
                result.add(temp);
            }
        }

        return result;
    }

    public List<Book> findBooksReleasedAfterAGivenYear(int year) {
        List<Book> result = new ArrayList<>();

        for (int i = 0; i < books.size(); i++) {
            Book temp = books.get(i);

            if (temp.getYearOfPublication() > year) {
                result.add(temp);
            }
        }

        return result;
    }

    public void print(){
        for (Book book: books){
            System.out.println(book.toString());
        }
    }
}
