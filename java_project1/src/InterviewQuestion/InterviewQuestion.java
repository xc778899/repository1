package InterviewQuestion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class InterviewQuestion {

    public static void main(String[] args) {

        // 将int[] 转化为 Integer[]

        /*int[] a = {1,2,3,4,5};
        Integer[]  ai = new Integer[a.length];
        for(int i=0;i<a.length;i++)
            ai[i] = a[i];
        System.out.println(Arrays.toString(ai));*/

        /*int[] a = {1,2,3,4,5};
        Integer[] ai = new Integer[a.length];
        ai = Arrays.stream(a).boxed().toArray(Integer[]::new);
        System.out.println(Arrays.toString(ai));*/

        int[] a = {1,2,3,4,5};
        //  Stream<Integer> boxed() 返回一个由这个流的元素组成的 Stream ，Stream中每个元素包含一个 Integer
        Integer[] i = Arrays.stream(a).boxed().toArray(Integer[] :: new);
        System.out.println(Arrays.toString(i));


//        List<String> strs = Arrays.asList("a", "b", "c");
//        String[] dd = strs.stream().toArray(str -> new String[3]);
//        String[] dd1 = strs.stream().toArray(String[]::new);  // 对一个Stream<T>对象调用toArray(Function)
//        Object[] obj = strs.stream().toArray();
//
//
//        String[] dd2 = strs.toArray(new String[0]);
//        Object[] obj1 = strs.toArray();
//
//        String[] s = strs.toArray(new String[0]);
//
//        System.out.println(Arrays.toString(dd));
    }
}
