package edu.traning.lesson14.book;

import java.util.Objects;

public class Book {
    private int id;
    private String tittle;
    private String author;
    private String publishingHouse;
    private int yearOfPublication;
    private int numberOfPages;
    private double cost;
    private String typeOfBinding;


    public Book() {
    }

    public Book(int id, String tittle, String author, String publishingHouse, int yearOfPublication, int numberOfPages, double cost, String typeOfBinding) {
        this.id = id;
        setTittle(tittle);
        setAuthor(author);
        setPublishingHouse(publishingHouse);
        setYearOfPublication(yearOfPublication);
        setNumberOfPages(numberOfPages);
        setCost(cost);
        setTypeOfBinding(typeOfBinding);
    }

    public int getId() {
        return id;
    }


    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getTypeOfBinding() {
        return typeOfBinding;
    }

    public void setTypeOfBinding(String typeOfBinding) {
        this.typeOfBinding = typeOfBinding;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return getId() == book.getId() && getYearOfPublication() == book.getYearOfPublication() && getNumberOfPages() == book.getNumberOfPages() && getCost() == book.getCost() && Objects.equals(getTittle(), book.getTittle()) && Objects.equals(getAuthor(), book.getAuthor()) && Objects.equals(getPublishingHouse(), book.getPublishingHouse()) && Objects.equals(getTypeOfBinding(), book.getTypeOfBinding());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getTittle(), getAuthor(), getPublishingHouse(), getYearOfPublication(), getNumberOfPages(), getCost(), getTypeOfBinding());
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", tittle='" + tittle + '\'' +
                ", author='" + author + '\'' +
                ", publishingHouse='" + publishingHouse + '\'' +
                ", yearOfPublication=" + yearOfPublication +
                ", numberOfPages=" + numberOfPages +
                ", cost=" + cost +
                ", typeOfBinding='" + typeOfBinding + '\'' +
                '}';
    }
}
