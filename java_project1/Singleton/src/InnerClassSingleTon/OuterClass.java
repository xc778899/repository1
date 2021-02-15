package InnerClassSingleTon;

public class OuterClass {

    static class InnerClass
    {
        private static OuterClass instance = new OuterClass();
    }

    public static OuterClass getInstance()
    {
        return InnerClass.instance;
    }

    private OuterClass(){
        if (InnerClass.instance != null)
        {
            throw new RuntimeException("单例类不允许创建多个实例");
        }
    }
}


