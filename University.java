package com.javarush.task.task29.task2909.human;

import java.util.*;

public class University  {
    String name;
    int age;
    private List<Student> students = new ArrayList<>();

    public University(String name, int age) {
        this.name = name;
        this.age = age;
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

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Student getStudentWithAverageGrade(double averageGrade) {
        for (Student student : students) {
            if (student.getAverageGrade() == averageGrade) return student;
        }
        return null;
    }

    public Student getStudentWithMaxAverageGrade() {
         return Collections.max(students, Comparator.comparingDouble(Student::getAverageGrade));
    }

    public Student  getStudentWithMinAverageGrade() {
        return Collections.min(students, Comparator.comparingDouble(Student::getAverageGrade));
    }

    public void expel(Student student){
        students.remove(student);
    }
}