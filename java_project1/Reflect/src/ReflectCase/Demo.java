package ReflectCase;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        List<Integer> list = new ArrayList<>();
        Class<List> ls = List.class;
        Method add = ls.getMethod("add", Object.class);
        add.invoke(list,"hahaha");
        add.invoke(list,"hahaha");
        add.invoke(list,"hahaha");
        add.invoke(list,"hahaha");
        System.out.println(list);


    }
}
