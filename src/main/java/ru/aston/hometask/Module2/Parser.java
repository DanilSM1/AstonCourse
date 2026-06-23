package ru.aston.hometask.Module2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Parser {
    public List<Student> parse(){
        String filepath = "D:\\Учеба\\Мага\\AstonCourse\\src\\main\\resources\\StudentsAndBooks.txt";
        List<Student> students = new ArrayList<>();

        final String studentEnds = ":";
        final String bookEnds = ";";
        final String empty = "";
        final String separator = ",";

        try (
                BufferedReader bufferedReader = new BufferedReader(new FileReader(filepath))) {
            String line;
            Student currentStudent = null;

            while ((line = bufferedReader.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty())
                    continue;

                if (line.endsWith(studentEnds)) {
                    if (currentStudent != null) {
                        students.add(currentStudent);
                    }
                    currentStudent = new Student(line.replaceAll(studentEnds, empty));
                } else if (line.endsWith(bookEnds)) {
                    String cleanLine = line.replaceAll(bookEnds, empty);
                    String[] parts = cleanLine.split(separator);
                    if (parts.length == 3) {
                        Book book = new Book(parts[0].trim(),
                                Integer.parseInt(parts[1].trim()),
                                Integer.parseInt(parts[2].trim()));
                        currentStudent.addBooks(book);
                    }
                }
            }

            if (currentStudent != null) {
                students.add(currentStudent);
            }
        } catch (
                IOException e) {
            e.printStackTrace();
        }
        return students;
    }
}
