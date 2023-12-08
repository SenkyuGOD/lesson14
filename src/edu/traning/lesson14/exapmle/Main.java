package edu.traning.lesson14.exapmle;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
//		List<Integer> list1 = new ArrayList<Integer>();

        list.add("White");
        list.add("Black");
        list.add("Red");
        list.add("Yellow");
        list.add("Orange");
        list.add("Green");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + " - " + list.get(i));//list[i]
        }

        list.remove(2);

        System.out.println("--------------------------");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + " - " + list.get(i));
        }


        /////////////////////////////////////////////////////////////////

        list.add("Purple");
        list.add(1, "Blue");

        System.out.println("--------------------------");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + " - " + list.get(i));
        }

        /////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////

        List<Book> books = new ArrayList<Book>();

        books.add(new Book(1, "Java", "Ekkel", 310));
        books.add(new Book(2, "C++", "Straustrup", 300));
        books.add(new Book(3, "Asm", "Pinsler", 300));

        System.out.println("--------------------------");
        System.out.println("--------------------------");
        for (int i = 0; i < books.size(); i++) {
            Book b = books.get(i);//books[i]
            String message = "Book: id="+b.getId() + ", title="+b.getTitle()+", author="+b.getAuthor()+", price="+b.getPrice();
            System.out.println(i + " - " + message);
        }

        books.add(new Book(4, "Ada", "Lavleis", 600));
        books.add(2, new Book(5, "C", "Kernigan", 300));

        System.out.println("--------------------------");
        for (int i = 0; i < books.size(); i++) {
            Book b = books.get(i);
            String message = "Book: id="+b.getId() + ", title="+b.getTitle()+", author="+b.getAuthor()+", price="+b.getPrice();
            System.out.println(i + " - " + message);
        }

        books.remove(3);

        System.out.println("--------------------------");
        for (int i = 0; i < books.size(); i++) {
            Book b = books.get(i);
            String message = "Book: id="+b.getId() + ", title="+b.getTitle()+", author="+b.getAuthor()+", price="+b.getPrice();
            System.out.println(i + " - " + message);
        }
    }

}