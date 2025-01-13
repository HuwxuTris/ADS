package Homework_1;

import java.util.*;

class Student {
    public String fullName;
    public int age;
    public int GPA;

    public Student(String fullName, int age, int GPA) {
        this.fullName = fullName;
        this.age = age;
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return String.format("Student{fullName='%s', age=%d, GPA=%d}", fullName, age, GPA);
    }

}
