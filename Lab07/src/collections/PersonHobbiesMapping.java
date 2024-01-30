package collections;

import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.TreeMap;

class Person implements Comparable<Person> 
{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return "Name: " + name + " Age: " + age;
    }
}

public class PersonHobbiesMapping 
{
    public static void main(String[] args) 
    {
        TreeMap<String, ArrayList<Person>> map = new TreeMap<>();

        map.computeIfAbsent("Singing", k -> new ArrayList<>()).add(new Person("Bhairavi", 22));
        map.computeIfAbsent("Sketching", k -> new ArrayList<>()).add(new Person("Dhara", 23));
        map.computeIfAbsent("Reading", k -> new ArrayList<>()).add(new Person("Anmol", 23));
        map.computeIfAbsent("Singing", k -> new ArrayList<>()).add(new Person("Megh", 21));
        map.computeIfAbsent("Sketching", k -> new ArrayList<>()).add(new Person("Raag", 22));

        System.out.println("Sorted List of Persons and Their Hobbies:");
        for (Entry<String, ArrayList<Person>> entry : map.entrySet()) {
            System.out.println("\nHobby: " + entry.getKey());
            for(Person person : entry.getValue()) {
            	System.out.println(person);
            }
        }
    }
}

