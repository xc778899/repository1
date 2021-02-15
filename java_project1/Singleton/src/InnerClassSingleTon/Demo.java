package InnerClassSingleTon;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Demo {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {

        Constructor<OuterClass> declaredConstructor = OuterClass.class.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        OuterClass outerClass = declaredConstructor.newInstance();
        System.out.println(outerClass);

        OuterClass instance = OuterClass.getInstance();
        System.out.println(instance);
    }
}
