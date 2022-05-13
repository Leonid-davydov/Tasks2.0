package task1;

public class Start {
    public static void main(String[] args) {
        Start obj = new Start();
        Class <?> start = obj.getClass();

        System.out.println("Task 1");
        System.out.println(start.getClassLoader());
        System.out.println(start.getClassLoader().getParent());
        System.out.println(start.getClassLoader().getParent().getParent());

        Class <Integer> integer = Integer.class;

        System.out.println("Task 2");
        System.out.println(integer.getClassLoader());

        System.out.println("Task 3");
        System.out.println(MyClass.class.getClassLoader());
        System.out.println(MyClass.class.getClassLoader().getParent());
        System.out.println(MyClass.class.getClassLoader().getParent().getParent());
    }
}
