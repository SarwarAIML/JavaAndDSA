package miscellaneous.comprableComparator;

import java.util.*;

public class Student implements Comparable<Student>{

    int rollno;
    String name;
    int age;

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
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

    public Student(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student student) {
        return this.getAge()-student.getAge();
    }

    public static void main(String[] args) {
        Student s3 = new Student(30,"sarwar3",22);
        Student s1 = new Student(44,"sarwardd",41);
        Student s2 = new Student(20,"sarwar2",11);
        Student s4 = new Student(10,"sarwar1",33);
        Comparator<Student> byname = (Student s,Student ss) -> s.getName().compareTo(ss.getName());

        Set<Student> set = new TreeSet<Student>();
        set.add(s1);
        set.add(s4);
        set.add(s2);
        set.add(s3);
        System.out.println(set);
        System.out.println("===================");
        Set<Student> set2 = new TreeSet<Student>(byname);
        set2.add(s1);
        set2.add(s4);
        set2.add(s2);
        set2.add(s3);
        System.out.println(set2);
    }
}
