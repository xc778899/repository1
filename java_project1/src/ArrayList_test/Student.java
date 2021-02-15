package ArrayList_test;

public class Student
{
    private String name;
    private int age;

    Student(String name, int age)
    {
        this.name = new String(name);
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
}