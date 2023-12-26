package Sorting.Collections.Sort;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Student {
    int roll;
    String name;
    String email;

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Student(int roll, String name, String email) {
        this.roll = roll;
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}





public class TreeSetUsingComparator {
    public static void main(String[] args) {

        Comparator<Student> firstNameComparator = (u1, u2) -> u1.getName().compareTo(u2.getName());

        Student s1 = new Student(4,"Sarwar","gssarwar@gmail.com");
        Student s2 = new Student(9,"AAfrin","gssarwar@gmail.com");
        Student s3 = new Student(4,"Zabi","gssarwar@gmail.com");

        Set<Student> set = new TreeSet<Student>(firstNameComparator);
        set.add(s1);
        set.add(s2);
        set.add(s3);
        System.out.println(set);

    }
}
