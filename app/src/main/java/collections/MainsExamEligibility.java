package collections;

import org.checkerframework.checker.units.qual.C;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class MainsExamEligibility {
    public static void main(String[] args) {
        Comparator<Student> marksComparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.marks.compareTo(o2.marks);
            }
        };

        TreeSet<Student> studentSet = new TreeSet<>(marksComparator);
        studentSet.add(new Student("Barret Lee",62));
        studentSet.add(new Student("Matthew Moore", 29));
        studentSet.add(new Student("Nellie Mcgrath", 18));
        studentSet.add(new Student("Jerrod Blair", 59));
        studentSet.add(new Student("Jack Mccoy", 70));
        studentSet.add(new Student("Andy Farrell", 60));

        Set<Student> passedStudents = studentSet.tailSet(new Student(35));
        passedStudents.forEach(System.out::println);
    }

    private static class Student {
        private String name;
        private Integer marks;

        public Student(Integer marks) {
            this.marks = marks;
        }

        public Student(String name, Integer marks) {
            this.name = name;
            this.marks = marks;
        }
    }
}
