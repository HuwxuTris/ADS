package Homework_1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Hoàng Văn A", 20, 3));
        students.add(new Student("Nguyễn Văn B", 19, 4));
        students.add(new Student("Hoàng Văn A", 22, 3));
        students.add(new Student("Nguyễn Văn C", 19, 2));

        //#1: Sắp xếp theo fullName, nếu trùng fullName thì ai lớn tuổi hơn đứng trước
        students.sort((s1, s2) -> {
            int nameCompare = s1.fullName.compareTo(s2.fullName);
            if (nameCompare != 0) {
                return nameCompare;
            }
            return Integer.compare(s2.age, s1.age);
        });
        System.out.println("Sắp xếp theo fullName, tuổi giảm dần nếu fullName trùng:");
        students.forEach(System.out::println);

        //#2: Sắp xếp theo tuổi tăng dần, nếu bằng tuổi thì GPA giảm dần
        students.sort((s1, s2) -> {
            int ageCompare = Integer.compare(s1.age, s2.age);
            if (ageCompare != 0) {
                return ageCompare;
            }
            return Integer.compare(s2.GPA, s1.GPA);
        });
        System.out.println("\nSắp xếp theo tuổi tăng dần, GPA giảm dần nếu cùng tuổi:");
        students.forEach(System.out::println);

        //#3: Sắp xếp theo tên
        students.sort((s1, s2) -> {
            String lastName1 = s1.fullName.substring(s1.fullName.lastIndexOf(' ') + 1);
            String lastName2 = s2.fullName.substring(s2.fullName.lastIndexOf(' ') + 1);
            return lastName1.compareTo(lastName2);
        });
        System.out.println("\nSắp xếp theo tên (xét phần tên cuối):");
        students.forEach(System.out::println);
    }
}

