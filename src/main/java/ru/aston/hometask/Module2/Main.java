package ru.aston.hometask.Module2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Parser parser = new Parser();
        List<Student> students = parser.parse();
        students.stream()
                .peek(System.out::println)
                .map(Student::getBooks)
                .flatMap(List::stream)
                .sorted(Comparator.comparingInt(Book::getCountOfPages))
                .distinct()
                .filter(book -> book.getYearOfPublication() > 2000)
                .limit(3)
                .map(Book::getYearOfPublication)
                .findFirst()
                .ifPresentOrElse(System.out::println,
                        () -> System.out.println("Книги не существует"));
    }
}
