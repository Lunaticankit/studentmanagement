package model;

import java.util.ArrayList;

public class Teams {
    String name;
    int seats;
    ArrayList<Student>studentArrayList;

    public Teams(String name, int seats, ArrayList<Student> studentArrayList) {
        this.name = name;
        this.seats = seats;
        this.studentArrayList = studentArrayList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public ArrayList<Student> getStudentArrayList() {
        return studentArrayList;
    }

    public void setStudentArrayList(ArrayList<Student> studentArrayList) {
        this.studentArrayList = studentArrayList;
    }
}
