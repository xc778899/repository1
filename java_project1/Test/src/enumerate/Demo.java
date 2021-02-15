package enumerate;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        EnumDemo[] values = EnumDemo.values();
        for (EnumDemo e : values)
        {
            e.show();
        }

    }
}
