package task18;

import java.lang.reflect.Field;

public class BadInitializer extends Initializer {

    static <T> void initialize(T target, String fieldName, Object value) throws NoSuchFieldException,
            IllegalAccessException {

        Field field = target.getClass().getDeclaredField(fieldName);
        field.setAccessible(true);
        field.set(target, value);
    }
}
