package task18;

import java.lang.reflect.InvocationTargetException;
import java.text.Annotation;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException,
            InstantiationException, IllegalAccessException, NoSuchFieldException {
        Apple a1 = new Apple();
        a1.setColor("Red");
        a1.setWeight(2.5);
        System.out.println(a1.getColor());
        System.out.println(a1.getWeight());

        Apple a2 = ObjectFactory.create(a1.getClass());
        System.out.println(a2.getColor());
        System.out.println(a2.getWeight());

        Initializer.initialize(a2, "color", "White");
        Initializer.initialize(a2, "weight", 4.0);
        System.out.println(a2.getColor());
        System.out.println(a2.getWeight());

        BadInitializer.initialize(a2, "color", "Green");
        BadInitializer.initialize(a2, "weight", 10.0);
        System.out.println(a2.getColor());
        System.out.println(a2.getWeight());
    }
}
