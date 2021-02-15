package ArrayList_test;

import java.util.ArrayList;




public class ArrayListInit {
    public static void main(String[] args) {
        Student student = new Student("张三丰", 18);
        ArrayList<Student> al = new ArrayList<>();
        al.add(student);
        ArrayList<String> bl = new ArrayList<>();
        bl.add("hello");
        System.out.println(bl);
    }
}
