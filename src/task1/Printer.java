package task1;

public class Printer {
    public static void printParentsClassLoaders (Class<?> clazz) {
        System.out.println(clazz.getClassLoader());
        System.out.println(clazz.getClassLoader().getParent());
        System.out.println(clazz.getClassLoader().getParent().getParent());
    }

    public static void printClassLoader (Class<?> clazz) {
        System.out.println(clazz.getClassLoader());
    }

    public static void taskNumber (int num) {
        System.out.println("Task " + num);
    }
}
