package com.app;
//Database Structuring
public class Subject {
    int present;
    int absent;
    int total;
    int marks;
    int totalMarks;

    //Constructor
    public Subject() {
        present = 0;
        absent = 0;
        total = 0;
        marks = 0;
        totalMarks = 0;
    }

    //Getter and Setters
    public int getPresent() {
        return present;
    }

    public int getAbsent() {
        return absent;
    }

    public int getMarks() {
        return marks;
    }

    public int getTotal() {
        return total;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public void setPresent(int present) {
        this.present = present;
    }

    public void setAbsent(int absent) {
        this.absent = absent;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }
}
