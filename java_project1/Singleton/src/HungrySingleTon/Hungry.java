package HungrySingleTon;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// 在类加载过程中对实例进行初始化
public class Hungry {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        Constructor<HST> declaredConstructor = HST.class.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        HST hst = declaredConstructor.newInstance();
        System.out.println(hst);

        HST instance = HST.getInstance();
        System.out.println(instance);
    }
}
class HST
{
    private static HST instance = new HST();

    public static HST getInstance()
    {
        return instance;
    }
    private HST(){
        // 写不能反射创建实例代码
    }
}
