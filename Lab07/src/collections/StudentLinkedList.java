package collections;

import java.util.Collections;
import java.util.LinkedList;

class Student implements Comparable<Student> 
{
    String name;
    int rollNumber;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    @Override
    public int compareTo(Student other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', rollNumber=" + rollNumber + '}';
    }
}

public class StudentLinkedList 
{
    public static void main(String[] args) 
    {
        LinkedList<Student> studentList = new LinkedList<>();

        studentList.add(new Student("John", 101));
        studentList.add(new Student("Alice", 102));
        studentList.add(new Student("Bob", 103));
        studentList.add(new Student("Eva", 104));
        studentList.add(new Student("Charlie", 105));

        Collections.sort(studentList);

        System.out.println("Sorted List of Students:");
        for(Student student : studentList) {
            System.out.println(student);
        }
    }
}

