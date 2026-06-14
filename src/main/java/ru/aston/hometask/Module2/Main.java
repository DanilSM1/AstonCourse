package ru.aston.hometask.Module2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        String filepath = "D:\\Учеба\\Мага\\AstonCourse\\src\\main\\resources\\StudentsAndBooks.txt";
        List<Student> students = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filepath))){
            String line;
            Student currentStudent = null;

            while ((line = bufferedReader.readLine()) != null){
                line = line.trim();
                if (line.isEmpty())
                    continue;

                if (line.endsWith(":")){
                    if (currentStudent != null){
                        students.add(currentStudent);
                    }
                    currentStudent = new Student(line.replaceAll(":", ""));
                } else if (line.endsWith(";")) {
                    String cleanLine = line.replaceAll(";", "");
                    String[] parts = cleanLine.split(",");
                    if (parts.length == 3){
                        Book book = new Book(parts[0].trim(),
                                Integer.parseInt(parts[1].trim()),
                                Integer.parseInt(parts[2].trim()));
                        currentStudent.addBooks(book);
                    }
                }
            }

            if (currentStudent != null){
                students.add(currentStudent);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
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
