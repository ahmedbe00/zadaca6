package org.ahmedbe00.qamp.zadaci.zadaca6.task;

public class Main {
    public static void main(String[] args) {
        final Classroom classroom=new Classroom();
        classroom.addStudent("Ahmed");
        classroom.addStudent("Tarik");
        classroom.addStudent("Gorjan");
        classroom.addStudent("Ivan");

        classroom.printClassroom();
        System.out.println(classroom.isPresent("Ivan"));

        final Students students=new Students("Ahmed");
        final Students students1=new Students("Tarik",17);

        System.out.println(students.toString());
        System.out.println(students.toString());
    }
}
