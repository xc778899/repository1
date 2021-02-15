package Serializable_Question;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SerializableTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Student s = Student.getInstance();
        ObjectOutputStream oop = new ObjectOutputStream(new FileOutputStream("s"));
        oop.writeObject(s);
        oop.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("s"));
        Object o = ois.readObject();
        Student s1 = (Student)o;
        ois.close();
        System.out.println(s1==s);
    }
}
