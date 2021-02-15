package Test__;

import java.util.function.IntFunction;

public class Test {
    public static void main(String[] args) {

        Class<Student> studentClass = Student.class;
    }

    public static final void f(IntFunction<Student> i)
    {
        Student s0 = i.apply(0);

    }
}
