package ru.aston.hometask.Module2;

import java.util.Objects;

public class Book {

    private String name;
    private int yearOfPublication;
    private int countOfPages;

    public Book(String name, int yearOfPublication, int countOfPages) {
        this.name = name;
        this.yearOfPublication = yearOfPublication;
        this.countOfPages = countOfPages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public int getCountOfPages() {
        return countOfPages;
    }

    public void setCountOfPages(int countOfPages) {
        this.countOfPages = countOfPages;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;
        return yearOfPublication == book.yearOfPublication && countOfPages == book.countOfPages && Objects.equals(name, book.name);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(name);
        result = 31 * result + yearOfPublication;
        result = 31 * result + countOfPages;
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", yearOfPublication=" + yearOfPublication +
                ", countOfPages=" + countOfPages +
                '}';
    }
}
