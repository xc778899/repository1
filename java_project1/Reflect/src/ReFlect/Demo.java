package ReFlect;

import com.sun.tools.javac.Main;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class Demo {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Class<Student> sc = Student.class;
//        System.out.println(sc);
//        Constructor<?>[] con = sc.getDeclaredConstructors();
//        System.out.println(Arrays.toString(con));

        // Constructors :
        /* [public ReFlect.Student(java.lang.String,int,int,java.lang.String),
            protected ReFlect.Student(java.lang.String,java.lang.String),
            ReFlect.Student(java.lang.String,int),
            private ReFlect.Student(int)]*/

        Constructor<Student> constructor = sc.getConstructor(String.class, int.class, int.class, String.class);
        Student student = constructor.newInstance("张三", 21, 100, "男");
        System.out.println(student);

        Constructor<Student> constructor1 = sc.getDeclaredConstructor(String.class, String.class);
        Student student1 = constructor1.newInstance("郑爽", "女");
        System.out.println(student1);

        Constructor<Student> dc = sc.getDeclaredConstructor(int.class);
        dc.setAccessible(true);
        Student student2 = dc.newInstance(20);
        System.out.println(student2);


    }
}
