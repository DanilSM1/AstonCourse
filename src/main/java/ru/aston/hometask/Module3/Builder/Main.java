package ru.aston.hometask.Module3.Builder;

public class Main {
    public static void main(String[] args) {
        Student student = new Student.StudentBuilder("Daniil", 23, "smirnovdanka@gmail.com").setNameOfCourse("AstonCourse").setAddress("Moscow").build();
        System.out.println(student);
    }
}
