package collections;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.*;

public class ArrayListSortingDemo {

    public void printStudentList(List<Student>students){
        for(Student student : students){
            System.out.println("The name of the student is " + student.name + " and age is " + student.age + "and is from class " + student.classNo);
        }
    }

    public static void main(String args[]) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Beth", 7, 4));
        students.add(new Student("Andy", 9, 6));
        students.add(new Student("Dev", 8, 5));
        students.add(new Student("Cindy", 12, 8));
        students.add(new Student("Earg", 9, 6));

        ArrayListSortingDemo studentList = new ArrayListSortingDemo();
        //Challenge 1 : Find all students above 8 years and print their names
        for(Student student : students){
            if(student.age > 8 ){
                System.out.println(student.name);
            }
        }

        //Challenge 2 : Find all students in class 6
        for (Student student : students){
            if(student.classNo == 6){
                System.out.println(student.name);
            }
        }

        //Challenge 3:Sort students by age, name and class
        //By age
        Collections.sort(students, new Comparator<Student>() {
            public int compare(Student student1, Student student2){
                return student1.age - student2.age;
            }
        });
        System.out.println("Printing the student list by comparison of age ");
        studentList.printStudentList(students);

        //By name
        Collections.sort(students, new Comparator<Student>() {
            public int compare(Student student1, Student student2){
                return student1.name.compareTo(student2.name);
            }
        });
        System.out.println("Printing the student list by comparison of name ");
        studentList.printStudentList(students);

        //By Class Number
        Collections.sort(students, new Comparator<Student>() {
            public int compare(Student student1, Student student2){
                return student1.classNo - student2.classNo;
            }
        });
        System.out.println("Printing the student list by comparison of age ");
        studentList.printStudentList(students);
    }

    private static class Student {
        private String name;
        private int age;
        private int classNo;

        public Student(String name, int age, int classNo) {
            this.name = name;
            this.age = age;
            this.classNo = classNo;
        }
    }
}