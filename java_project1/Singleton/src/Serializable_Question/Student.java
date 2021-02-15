package Serializable_Question;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class Student implements Serializable {

    private static Student instance = new Student();

    public static Student getInstance() {
        return instance;
    }

    Object readResolve() throws ObjectStreamException{
        return instance;
    }

    private Student(){}
}
