package ArrayList_test;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {

    public static void main(String[] args) {
        process_control();
    }
    public static void process_control()
    {
        show_system_interface();
        ArrayList<Student> al = new ArrayList<>();
        while (true)
        {
            System.out.println("请输入宁的操作:");
            Scanner sc = new Scanner(System.in);
            int i = sc.nextInt();
            switch (i)
            {
                case 1 : add_student(al);break;
                case 2 : modify_student(al);break;
                case 3 : remove_student(al);break;
                case 4 : show_student_list(al);break;
                case 5 : System.exit(0);
                default:
                    System.out.println("宁输入的操作数有误,请重新输入!");
            }
        }
    }

    public static void show_system_interface()
    {
        System.out.println("---------欢迎来到学生管理系统---------");
        System.out.println("1 添加学生");
        System.out.println("2 修改学生");
        System.out.println("3 删除学生");
        System.out.println("4 查看所有学生");
        System.out.println("5 退出");
    }

    public static void add_student(ArrayList<Student> al)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入添加的同学姓名:");
        String name = sc.nextLine();
        System.out.println("请输入添加的同学年龄:");
        int age = sc.nextInt();
        Student s = new Student(name, age);
        al.add(s);
    }

    public static int find_scanner_student(ArrayList<Student> al)
    {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int i;
        for (i=0;i< al.size();i++)
        {
            if (name.equals(al.get(i).getName()))
            {
                return i;
            }
        }
        System.out.println("没有找到这个学生");
        return -1;
    }

    public static void remove_student(ArrayList<Student> al)
    {
        System.out.println("请输入要删除学生的姓名:");
        al.remove(find_scanner_student(al));
    }

    public static void modify_student(ArrayList<Student> al)
    {
        System.out.println("请输入要修改学生的姓名:");
        int i = find_scanner_student(al);
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入修改后的姓名:");
        String name = scanner.nextLine();
        System.out.println("请输入修改后的年龄:");
        int age = scanner.nextInt();
        Student new_student = new Student(name, age);
        al.set(i, new_student);
    }

    public static void show_student_list(ArrayList<Student> al)
    {
        System.out.println("姓名        年龄");
        for (int i=0;i< al.size();i++)
        {
            System.out.printf("%s        %d\n",al.get(i).getName(),al.get(i).getAge());
        }

    }

}
