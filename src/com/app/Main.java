package com.app;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.*;
public class Main {
    //Set Attendance function
    Subject setAttendance(Subject s) {
        Scanner sc = new Scanner(System.in);
        int ch = 0;
        while (ch != -1) {
            System.out.println("   1. Mark Present");
            System.out.println("   2. Mark Absent");
            System.out.println("   3. Set manual");
            System.out.println("   4. Set total");
            System.out.println("   5. Previous Menu");
            ch = sc.nextInt();
            if (ch == 1) {
                s.present++;
                s.absent = s.total - s.present;
                System.out.println("Marked");
            }
            else if (ch == 2) {
                s.absent++;
                s.present = s.total - s.absent;
                System.out.println("Marked");
            }
            else if (ch == 3) {
                System.out.println("Enter the number of days present");
                s.present = sc.nextInt();
                s.absent = s.total - s.present;
            }
            else if(ch==4){
                System.out.println("Enter the total number of classes");
                s.total=sc.nextInt();
            }
            else if (ch == 5) {
                break;
            }
            else {
                System.out.println("Invalid choice! Try again");
            }
        }
        return s;
    }

    Subject setMarks(Subject s) {
        int exit=1;
        int choice=0;
        Scanner sc = new Scanner(System.in);
        while(exit!=0){
            System.out.println(" 1. Enter marks");
            System.out.println(" 2. Set Total Marks");
            System.out.println(" 3. Previous Menu");
            choice=sc.nextInt();
            if(choice==1){
                System.out.println("Enter the new marks");
                int marks = sc.nextInt();
                s.setMarks(marks);
            }
            else if(choice==2){
                System.out.println("Enter the total marks");
                int t=sc.nextInt();
                s.setTotalMarks(t);
            }
            else if (choice==3){
                exit=0;
            }
            else{
                System.out.println("Invalid Choice");
            }
        }
        return s;
    }

    Student create(Student s) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the student's name");
        String n = sc.nextLine();
        s.setName(n);

        System.out.println("Enter the student's Branch");
        String b = sc.nextLine();
        s.setBranch(b);

        System.out.println("Enter the Student's Registration Number");
        String r=sc.nextLine();
        s.setRegno(r);

        int flag = -1;
        while (flag != 0) {
            System.out.println(" 1.Set for OOPS");
            System.out.println(" 2. Set for ds");
            System.out.println(" 3. Set for ida");
            System.out.println(" 4. Set for Maths");
            System.out.println(" 5. Previous Menu");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    int e = 1;
                    while (e != 0) {
                        System.out.println("  1.Set Attendance");
                        System.out.println("  2.Set Marks");
                        System.out.println("  3.Previous Menu");
                        int c = sc.nextInt();

                        if (c == 1) {
                            s.oops = setAttendance(s.oops);
                        }
                        else if (c == 2) {
                            s.oops = setMarks(s.oops);
                        }
                        else if (c == 3) {
                            e = 0;
                        }
                        else{
                            System.out.println("Invalid choice!");
                        }
                    }
                    break;
                case 2:
                     e = 1;
                    while (e != 0) {
                        System.out.println("  1.Set Attendance");
                        System.out.println("  2.Set Marks");
                        System.out.println("  3.Previous Menu");
                        int c = sc.nextInt();

                        if (c == 1) {
                            s.ds = setAttendance(s.ds);
                        }
                        else if (c == 2) {
                            s.ds = setMarks(s.ds);
                        }
                        else if (c == 3) {
                            e = 0;
                        }
                        else{
                            System.out.println("Invalid choice!");
                        }
                    }
                    break;
                case 3:
                     e = 1;
                    while (e != 0) {
                        System.out.println("  1.Set Attendance");
                        System.out.println("  2.Set Marks");
                        System.out.println("  3.Previous Menu");
                        int c = sc.nextInt();

                        if (c == 1) {
                            s.ida = setAttendance(s.ida);
                        }
                        else if (c == 2) {
                            s.ida = setMarks(s.ida);
                        }
                        else if (c == 3) {
                            e = 0;
                        }
                        else{
                            System.out.println("Invalid choice");
                        }
                    }
                    break;
                case 4:
                     e = 1;
                    while (e != 0) {
                        System.out.println("  1.Set Attendance");
                        System.out.println("  2.Set Marks");
                        System.out.println("  3.Previous Menu");
                        int c = sc.nextInt();

                        if (c == 1) {
                            s.maths = setAttendance(s.maths);
                        }
                        else if (c == 2) {
                            s.maths = setMarks(s.maths);
                        }
                        else if (c == 3) {
                            e = 0;
                        }
                        else{
                            System.out.println("Invalid choice");
                        }
                    }
                    break;
                case 5:
                    flag = 0;
                    break;
                default:
                    System.out.println("Invalid choice! Please retry");
            }
        }
        return s;
    }
    ArrayList<Student> Search(){
        ArrayList<Student> stud=readFile();
        ArrayList<Student> ser=new ArrayList<>(1);
        Scanner sc=new Scanner(System.in);
        System.out.println("  1. Search By Name");
        System.out.println("  2. Search By registration number");
        System.out.println("  3. Search By Branch");
        System.out.println("  4. Previous Menu");
        int choice=sc.nextInt();
        String x=sc.nextLine();

        if(choice==1){
               System.out.println("Enter the name you want to search");
               String n=sc.nextLine();
               for(int i=0;i<stud.size();i++){
                   if(stud.get(i).getName().equals(n)){
                       ser.add(stud.get(i));
                   }
               }
           }
           else if(choice==2){
               System.out.println("Enter the Registration Number you want to search");
               String r=sc.nextLine();
               for(int i=0;i<stud.size();i++){
                   if(stud.get(i).getRegno().equals(r)){
                       ser.add(stud.get(i));
                   }
               }
           }
           else if(choice==3){
               System.out.println("Enter the Branch you want to search");
               String b=sc.nextLine();
               for(int i=0;i<stud.size();i++){
                   if(stud.get(i).getBranch().equals(b)){
                       ser.add(stud.get(i));
                   }
               }

           }
           else{
               System.out.println("Invalid Choice");
           }

        return ser;
    }
    Student Search(int reg){
        ArrayList<Student> stud=readFile();
        Student x=new Student();
        for(int i=0;i<stud.size();i++) {
            if (Integer.parseInt(stud.get(i).getRegno())==reg) {
                x=stud.get(i);
                break;
            }
        }
        return x;
    }
    Student update(Student s){
        Scanner sc=new Scanner(System.in);
        int exit=1;int choice=0;
        while(exit!=0){
            System.out.println(" 1. Update OOPS");
            System.out.println(" 2. Update DS");
            System.out.println(" 3. Update IDA");
            System.out.println(" 4. Update Maths");
            System.out.println(" 5. Update Name");
            System.out.println(" 6. Update Branch");
            System.out.println(" 7. Update Registration Number");
            System.out.println(" 8. Previous menu");
            choice=sc.nextInt();
            String garbage=sc.nextLine();
            if(choice==1){
                int e=1;
                while(e!=0){
                    System.out.println("   1. Update Marks");
                    System.out.println("   2. Update Attendance");
                    System.out.println("   3. Previous Menu");
                    int ch=sc.nextInt();
                    if(ch==1){
                        s.oops=setMarks(s.oops);
                    }
                    else if(ch==2){
                        s.oops=setAttendance(s.oops);
                    }
                    else if(ch==3){
                        e=0;
                    }
                    else{
                        System.out.println("Invalid Choice");
                    }
                }
            }
            else if(choice==2){
                int e=1;
                while(e!=0){
                    System.out.println("   1. Update Marks");
                    System.out.println("   2. Update Attendance");
                    System.out.println("   3. Previous Menu");
                    int ch=sc.nextInt();
                    if(ch==1){
                        s.ds=setMarks(s.ds);
                    }
                    else if(ch==2){
                        s.ds=setAttendance(s.ds);
                    }
                    else if(ch==3){
                        e=0;
                    }
                    else{
                        System.out.println("Invalid Choice");
                    }
                }
            }
            else if(choice==3){
                int e=1;
                while(e!=0){
                    System.out.println("   1. Update Marks");
                    System.out.println("   2. Update Attendance");
                    System.out.println("   3. Previous Menu");
                    int ch=sc.nextInt();
                    if(ch==1){
                        s.ida=setMarks(s.ida);
                    }
                    else if(ch==2){
                        s.ida=setAttendance(s.ida);
                    }
                    else if(ch==3){
                        e=0;
                    }
                    else{
                        System.out.println("Invalid Choice");
                    }
                }
            }
            else if(choice==4){
                int e=1;
                while(e!=0){
                    System.out.println("   1. Update Marks");
                    System.out.println("   2. Update Attendance");
                    System.out.println("   3. Previous Menu");
                    int ch=sc.nextInt();
                    if(ch==1){
                        s.maths=setMarks(s.maths);
                    }
                    else if(ch==2){
                        s.maths=setAttendance(s.maths);
                    }
                    else if(ch==3){
                        e=0;
                    }
                    else{
                        System.out.println("Invalid Choice");
                    }
                }
            }
            else if(choice==5){
                System.out.println("Enter the updated name: ");
                String x="";
                x=sc.nextLine();
                s.setName(x);

            }
            else if(choice==6){
                System.out.println("Enter the updated branch: ");
                String x="";
                x=sc.nextLine();
                s.setBranch(x);
            }
            else if(choice==7){
                System.out.println("Enter the updated registration number: ");
                String x="";
                x=sc.nextLine();
                s.setRegno(x);
            }
            else if(choice==8){
                exit=0;
            }
            else{
                System.out.println("Invalid choice!");
            }
        }
        System.out.println("Updated");
        return s;
    }
    void display(Student s){
        System.out.println("Name: "+s.getName()+"   Branch: "+s.getBranch()+"   Registration Number: "+s.getRegno());
        System.out.println("Attendance Record: ");

        System.out.println("OOPS: ");
        System.out.println("Present: "+s.oops.getPresent()+" Absent: "+s.oops.getAbsent()+" Total: "+s.oops.getTotal());

        System.out.println("DS: ");
        System.out.println("Present: "+s.ds.getPresent()+" Absent: "+s.ds.getAbsent()+" Total: "+s.ds.getTotal());

        System.out.println("IDA: ");
        System.out.println("Present: "+s.ida.getPresent()+" Absent: "+s.ida.getAbsent()+" Total: "+s.ida.getTotal());

        System.out.println("Maths: ");
        System.out.println("Present: "+s.maths.getPresent()+" Absent: "+s.maths.getAbsent()+" Total: "+s.maths.getTotal());

//        System.out.println("Marks: ");
////        System.out.println("OOPS: "+s.oops.getMarks()+"/"+s.oops.getTotalMarks()+"  Percentage: "+((s.oops.getMarks()/s.oops.getTotalMarks())*100)+" %");
////        System.out.println("DS: "+s.ds.getMarks()+"/"+s.ds.getTotalMarks()+"  Percentage: "+((s.ds.getMarks()/s.ds.getTotalMarks())*100)+" %");
////        System.out.println("IDA: "+s.ida.getMarks()+"/"+s.ida.getTotalMarks()+"  Percentage: "+((s.ida.getMarks()/s.ida.getTotalMarks())*100)+" %");
////        System.out.println("Maths: "+s.maths.getMarks()+"/"+s.maths.getTotalMarks()+"  Percentage: "+((s.maths.getMarks()/s.maths.getTotalMarks())*100)+" %");
////        double p=((s.oops.getMarks()+s.maths.getMarks()+s.ida.getMarks()+s.ds.getMarks())/(s.oops.getTotalMarks()+s.ds.getTotalMarks()+s.ida.getTotalMarks()+s.maths.getTotalMarks()))*100.0;
////        System.out.println("Total Percentage: "+p+" % ");
        System.out.println("OOPS: "+s.oops.getMarks()+"/"+s.oops.getTotalMarks());
        System.out.println("DS: "+s.ds.getMarks()+"/"+s.ds.getTotalMarks());
        System.out.println("IDA: "+s.ida.getMarks()+"/"+s.ida.getTotalMarks());
        System.out.println("Maths: "+s.maths.getMarks()+"/"+s.maths.getTotalMarks());
        System.out.println();
        System.out.println();
    }
    void createFile(Student x){
        File dms = new File("Students.txt");
        try {
            dms.createNewFile();

        } catch (IOException e) {
            System.out.println("Unable to create this file");
            e.printStackTrace();
        }
        try {
            FileWriter studWriter = new FileWriter("students.txt", true);
                Subject oop= x.oops;
                Subject ds=x.ds;
                Subject ida=x.ida;
                Subject maths=x.maths;
                studWriter.write( x.getName() + "," + x.getBranch()+","+x.getRegno()+",");
                studWriter.write(oop.getPresent()+","+oop.getAbsent()+","+oop.getTotal()+","+oop.getMarks()+","+ oop.getTotalMarks()+",");
                studWriter.write(ds.getPresent()+","+ds.getAbsent()+","+ds.getTotal()+","+ds.getMarks()+","+ds.getTotalMarks()+",");
                studWriter.write(ida.getPresent()+","+ida.getAbsent()+","+ida.getTotal()+","+ida.getMarks()+","+ida.getTotalMarks()+",");
                studWriter.write(maths.getPresent()+","+maths.getAbsent()+","+maths.getTotal()+","+maths.getMarks()+","+ maths.getTotalMarks()+"\n");
                studWriter.close();
        } catch (IOException e) {
            System.out.println("error");
            e.printStackTrace();
        }
    }
    ArrayList<Student> readFile(){
        ArrayList<Student> stud=new ArrayList<>(1);
        String data;
        File myFile = new File("students.txt");
        try {
            Scanner sc = new Scanner(myFile);
            while (sc.hasNextLine()) {
                data = sc.nextLine();
                String[] dat = data.split(",");
                Student x=new Student();
                x.setName(dat[0]);
                x.setBranch(dat[1]);
                x.setRegno(dat[2]);
                x.oops.setPresent(Integer.parseInt(dat[3]));
                x.oops.setAbsent(Integer.parseInt(dat[4]));
                x.oops.setTotal(Integer.parseInt(dat[5]));
                x.oops.setMarks(Integer.parseInt(dat[6]));
                x.oops.setTotalMarks(Integer.parseInt(dat[7]));

                x.ds.setPresent(Integer.parseInt(dat[8]));
                x.ds.setAbsent(Integer.parseInt(dat[9]));
                x.ds.setTotal(Integer.parseInt(dat[10]));
                x.ds.setMarks(Integer.parseInt(dat[11]));
                x.ds.setTotalMarks(Integer.parseInt(dat[12]));

                x.ida.setPresent(Integer.parseInt(dat[13]));
                x.ida.setAbsent(Integer.parseInt(dat[14]));
                x.ida.setTotal(Integer.parseInt(dat[15]));
                x.ida.setMarks(Integer.parseInt(dat[16]));
                x.ida.setTotalMarks(Integer.parseInt(dat[17]));

                x.maths.setPresent(Integer.parseInt(dat[18]));
                x.maths.setAbsent(Integer.parseInt(dat[19]));
                x.maths.setTotal(Integer.parseInt(dat[20]));
                x.maths.setMarks(Integer.parseInt(dat[21]));
                x.maths.setTotalMarks(Integer.parseInt(dat[22]));
                stud.add(x);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return stud;
    }
    void updateFile(ArrayList<Student> stud){
        File dms = new File("Students.txt");
        try {
            dms.createNewFile();

        } catch (IOException e) {
            System.out.println("Unable to update this file");
            e.printStackTrace();
        }
        try {
            FileWriter studWriter = new FileWriter("students.txt",false);
            for(int i=0;i<stud.size();i++){
                Student x=stud.get(i);
                Subject oop= x.oops;
                Subject ds=x.ds;
                Subject ida=x.ida;
                Subject maths=x.maths;
                studWriter.write( x.getName() + "," + x.getBranch()+","+x.getRegno()+",");
                studWriter.write(oop.getPresent()+","+oop.getAbsent()+","+oop.getTotal()+","+oop.getMarks()+","+ oop.getTotalMarks()+",");
                studWriter.write(ds.getPresent()+","+ds.getAbsent()+","+ds.getTotal()+","+ds.getMarks()+","+ds.getTotalMarks()+",");
                studWriter.write(ida.getPresent()+","+ida.getAbsent()+","+ida.getTotal()+","+ida.getMarks()+","+ida.getTotalMarks()+",");
                studWriter.write(maths.getPresent()+","+maths.getAbsent()+","+maths.getTotal()+","+maths.getMarks()+","+ maths.getTotalMarks()+"\n");
            }
            studWriter.close();
        }
        catch (IOException e) {
            System.out.println("error");
            e.printStackTrace();
        }

    }
    public static void main (String[]args){
        int exit=1;
        Main obj=new Main();
        Scanner sc=new Scanner(System.in);
        ArrayList<Student> Stud=new ArrayList<>(1);
        while(exit!=0){
            System.out.println("1. Create a student");
            System.out.println("2. Update a student");
            System.out.println("3. Search a Student");
            System.out.println("4. Display");
            System.out.println("5.Exit");
            int choice=sc.nextInt();
            if(choice==1){
                Student s=new Student();
                s=obj.create(s);
                Stud.add(s);
                obj.createFile(s);
                System.out.println("Added to Database");
            }
            else if(choice==2){
                System.out.println("Enter the registration number you want to search");
                int r=sc.nextInt();
                String gar=sc.nextLine();
                System.out.println("r");
                Student x=obj.Search(r);
                x=obj.update(x);
                obj.display(x);
                Stud=obj.readFile();
                System.out.println(Stud.get(0));
                for(int i=0;i<Stud.size();i++){
                    System.out.println();
                    if(Integer.parseInt(Stud.get(i).getRegno())==r){
                        Stud.set(i,x);
                        obj.display(Stud.get(i));
                        break;
                    }
                    else{
                        System.out.println("Not found");
                    }
                }
                obj.updateFile(Stud);
                System.out.println("Record updated succesfully");
            }
            else if(choice==3){
                ArrayList<Student> ser=obj.Search();
                for(int i=0;i<ser.size();i++){
                    obj.display(ser.get(i));
                }
            }
            else if(choice==4){
                System.out.println("Display");
                Stud= obj.readFile();
                for(int i=0;i<Stud.size();i++){
                    obj.display(Stud.get(i));
                }
            }
            else if(choice==5){

                exit=0;
            }
            else{
                System.out.println("Invalid choice");
            }
        }
    }
}

