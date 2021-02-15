package LasySingleTon;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Time;
import java.util.Timer;
import java.util.concurrent.TimeUnit;


// 保证单例设计模式
public class LST {
    public static void main(String[] args) throws InterruptedException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {

        Constructor<LazyST> declaredConstructor = LazyST.class.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        LazyST lazyST = declaredConstructor.newInstance();
        System.out.println(lazyST);

        LazyST instance = LazyST.getInstance();
        System.out.println(instance);


    }
}

class LazyST
{
    private volatile static LazyST instance;
    public static LazyST getInstance(){  // 创建一个锁即可, 但有些耗费资源, 最好把锁加到if判断上
        // 多线程在判断同一个实例时会出现问题
        if (instance==null)
            synchronized (LazyST.class)
            {
                if (instance==null)
                {
                    // 同时进行判断,两个线程已经通过if判断,所以这个if判断就没有用了
    //            try {
    //                TimeUnit.MILLISECONDS.sleep(1000);
    //            } catch (InterruptedException e) {
    //                e.printStackTrace();
    //            }
                    instance = new LazyST();
                    /*new一个对象包括：类是否加载、为对象分配内存、并发处理、内存空间初始化、对象设置等步骤，*/
                }
    }

        return instance;
    }

    private LazyST()
    {}
}
