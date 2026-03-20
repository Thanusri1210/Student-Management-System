package model;
public class Student
{
    private int id;
    private String name;
    private int age;
    private String department;
    private int marks;
    private char grade;
    public Student(int id,String name,int age,String department,int marks)
    {
        this.id=id;
        this.name=name;
        this.age=age;
        this.department=department;
        setMarks(marks);
    }
    public void setMarks(int marks){
        if(marks<0 || marks>100){
            throw new IllegalArgumentException("Marks should be only between 0 and 100");
        }
        this.marks=marks;
        this.grade=calculateGrade(marks);
    }
    private char calculateGrade(int marks)
    {
        if(marks>=90)
        {
          return 'A';
        }
        else if(marks>=80)
        {
           return 'B';
        }
        else if(marks>=70)
        {
            return 'C';
        }
        else if(marks>=60)
        {
           return 'D';
        }
        else if(marks>=50)
        {
           return 'E';
        }
        else
        {
            return 'F';
        }
    }
    public int getId(){
        return id;
    }
    public int getAge(){
        return age;
    }
    public int getMarks(){
        return marks;
    }
    public String getName(){
        return name;
    }
    public String getDepartment(){
        return department;
    }
    public char getGrade(){
        return grade;
    }
}
