package com.example.harmanapp1;

public class Student {
   String name;
   int id;
   boolean isEliglible;

    public Student(String name, int id, boolean isEliglible) {
        this.name = name;
        this.id = id;
        this.isEliglible = isEliglible;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isEliglible() {
        return isEliglible;
    }

    public void setEliglible(boolean eliglible) {
        isEliglible = eliglible;
    }
}
