package task1;

public class Start {
    public static void main(String[] args) {
        Start obj = new Start();
        Class<?> objClass = obj.getClass();
        Class<Integer> integerClass = Integer.class;
        MyClass myClass = new MyClass();
        Class<?> myClassClass = myClass.getClass();

        Printer.taskNumber(1);
        Printer.printParentsClassLoaders(objClass);

        Printer.taskNumber(2);
        Printer.printClassLoader(integerClass);

        Printer.taskNumber(3);
        Printer.printParentsClassLoaders(myClassClass);
    }
}
