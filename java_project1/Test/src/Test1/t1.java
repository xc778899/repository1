package Test1;

class t1 {


    private static Object Draw = null;

    public t1 ()
    {
        t1.Draw = getInnerInstance();
    }
    public static Draw getInnerInstance()
    {
        return new Draw();
    }

    static class Draw {     //内部类

        public void drawSahpe() {
            System.out.println("我是内部类中的drawSharp方法");
        }
    }
}
