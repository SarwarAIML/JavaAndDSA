package com.gs.streams;

import com.gs.data.Student;
import com.gs.data.StudentDataBase;

import java.util.Map;

public class StreamsMapReduceExample {

    public static int noOfNoteBooks(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getNoteBooks)
                .reduce(0, Integer::sum);
    }

    public static void main(String[] args) {
        System.out.println(noOfNoteBooks());
    }
}