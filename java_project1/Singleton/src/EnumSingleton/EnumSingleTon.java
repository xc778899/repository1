package EnumSingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class EnumSingleTon {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        get instanceMethod = get.getInstanceMethod();
        System.out.println(instanceMethod.hashCode());

        Constructor<get> declaredConstructor = get.class.getDeclaredConstructor(String.class,int.class);
        declaredConstructor.setAccessible(true);
        get s = declaredConstructor.newInstance("si",0);
        System.out.println(s.hashCode());

    }
}


