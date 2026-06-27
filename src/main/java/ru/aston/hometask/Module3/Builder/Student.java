package ru.aston.hometask.Module3.Builder;

public class Student {

    private String name;
    private int age;
    private String email;
    private String nameOfCourse;
    private String address;

    public Student(StudentBuilder studentBuilder) {
        name = studentBuilder.name;
        age = studentBuilder.age;
        email = studentBuilder.email;
        nameOfCourse = studentBuilder.nameOfCourse;
        address = studentBuilder.address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNameOfCourse() {
        return nameOfCourse;
    }

    public void setNameOfCourse(String nameOfCourse) {
        this.nameOfCourse = nameOfCourse;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", nameOfCourse='" + nameOfCourse + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static class StudentBuilder {
        private String name;
        private int age;
        private String email;
        private String nameOfCourse;
        private String address;

        public StudentBuilder(String name, int age, String email) {
            this.name = name;
            this.age = age;
            this.email = email;
        }

        public StudentBuilder setNameOfCourse(String nameOfCourse){
            this.nameOfCourse = nameOfCourse;
            return this;
        }

        public StudentBuilder setAddress(String address){
            this.address = address;
            return this;
        }

        public Student build(){
            return new Student(this);
        }
    }
}
