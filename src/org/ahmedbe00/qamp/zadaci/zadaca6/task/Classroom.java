package org.ahmedbe00.qamp.zadaci.zadaca6.task;

import java.util.ArrayList;
import java.util.List;

public class Classroom {
    private List<String> students;

    public Classroom(){
        students = new ArrayList<>();

    }
    public String addStudent(final String name){
         students.add(name);
         return name;
    }
    public String isPresent(String name) {
        if (students.contains(name)) {
            return name + " is present.";
        } else {
            return name + " is not present.";
        }
    }
        public void printClassroom(){
            System.out.println("In Class room is : ");
            for (String nameInClassroom : students) {
                System.out.println(nameInClassroom);
            }
        }

    }
