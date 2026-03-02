package model;

public class Student {
    private int age;
    private int id;
    private int marks;
    private String name;
    private String department;
    private char grade;
    public Student(){

    }
    public Student(int age,int id,int marks,String name,String department)
    {
        this.age=age;
        this.id=id;
        this.marks=marks;
        this.name=name;
        this.department=department;
        if(marks>=90)
        {
           this.grade='A';
        }
        else if(marks>=80)
        {
           this.grade='B';
        }
        else if(marks>=70)
        {
            this.grade='C';
        }
        else if(marks>=60)
        {
           this.grade='D';
        }
        else if(marks>=50)
        {
            this.grade='E';
        }
        else
        {
            this.grade='F';
        }
    }
}
