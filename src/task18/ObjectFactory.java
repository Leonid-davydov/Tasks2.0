package task18;

import java.lang.reflect.*;

public class ObjectFactory {

    static <T> T create(Class<T> clazz) throws NoSuchMethodException, InvocationTargetException,
            InstantiationException, IllegalAccessException {

        if (chekConstructor(clazz) && chekGettersAndSetters(clazz)) {
            Constructor constructor = clazz.getConstructor();

            return (T) constructor.newInstance();
        } else {
            return null;
        }
    }

    static boolean chekConstructor(Class clazz) {
        try {
            Constructor constructor = clazz.getConstructor();
            return true;
        } catch (NoSuchMethodException | SecurityException e){
            System.out.println("Class does not contain standard constructor");
            return false;
        }
    }

    static boolean chekGettersAndSetters(Class clazz) {
        try {
            Field[] fields = clazz.getDeclaredFields();

            for (Field field : fields) {
                clazz.getMethod("get" +
                        field.getName().substring(0, 1).toUpperCase() + field.getName().substring(1));
                if (!Modifier.isFinal(field.getModifiers())){
                    clazz.getMethod("set" +
                                    field.getName().substring(0, 1).toUpperCase() + field.getName().substring(1)
                            , field.getType());
                }
            }
            return true;
        } catch (SecurityException | NoSuchMethodException e){
            System.out.println("Class does not contain getter or setter");
            return false;
        }
    }
}
