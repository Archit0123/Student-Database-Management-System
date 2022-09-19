package com.app;
//Database Structuring
public class Student{
    String name;
    String branch;
    String regno;
    Subject oops;
    Subject ds;
    Subject maths;
    Subject  ida;
    public Student(){
        name="";
        branch="";
        regno="";
        oops=new Subject();
        ds=new Subject();
        maths=new Subject();
        ida=new Subject();
    }
    //Getters and setters
    public String getName() {
        return name;
    }
    public String getBranch() {
        return branch;
    }
    public String getRegno() { return regno; }
    public void setName(String name) {
        this.name = name;
    }
    public void setBranch(String branch) {
        this.branch = branch;
    }
    public void setRegno(String regno) { this.regno = regno; }
}
