package ReFlect;

public class Student {

    private String name;
    int age;
    protected int num;
    public String sex;

    private Student(int num) {
        this.num = num;
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    protected Student(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public Student(String name, int age, int num, String sex) {
        this.name = name;
        this.age = age;
        this.num = num;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    void setAge(int age) {
        this.age = age;
    }

    public int getNum() {
        return num;
    }

    protected void setNum(int num) {
        this.num = num;
    }

    public String getSex() {
        return sex;
    }

    private void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", num=" + num +
                ", sex='" + sex + '\'' +
                '}';
    }
}
