package task18;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Initializer {
    static <T> void initialize(T target, String fieldName, Object value) throws NoSuchMethodException,
            InvocationTargetException, IllegalAccessException, NoSuchFieldException {

        Method setter = target.getClass().getDeclaredMethod("set" +
                        fieldName.substring(0, 1).toUpperCase() +
                        fieldName.substring(1),
                value.getClass());

        setter.invoke(target, value);
    }
}
