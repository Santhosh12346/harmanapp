package com.example.harmanapp1;

public class Employee {
    String name;
    int id;
    boolean iseloi;

    public Employee(String name, int id, boolean iseloi) {
        this.name = name;
        this.id = id;
        this.iseloi = iseloi;
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

    public boolean isIseloi() {
        return iseloi;
    }

    public void setIseloi(boolean iseloi) {
        this.iseloi = iseloi;
    }
}
