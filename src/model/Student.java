package model;

public class Student {
    int age;
    int id;
    int marks;
    String name;
    String department;
    String grade;
    public Student(){

    }
    public Student(int age,int id,int marks,String name,String department,String grade){
        this.age=age;
        this.id=id;
        this.marks=marks;
        this.name=name;
        this.department=department;
        this.grade=grade;
    }
}
