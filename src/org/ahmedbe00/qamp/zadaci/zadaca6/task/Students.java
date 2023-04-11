package org.ahmedbe00.qamp.zadaci.zadaca6.task;

public class Students {
    private String name;
    private  int age;
    public Students(String name){
        this(name,15);

    }
    public Students(String name, int age){
        this.name=name;
        this.age=age;
    }
    @Override
    public String toString(){
        return "Name: "+this.name+"  "+"Age: "+this.age;

    }



}
