package task17;

@Reflectable
public class MyClass extends A implements Comparable<MyClass>, Cloneable{
    @Reflectable
    String name;
    private int age;

    public MyClass() {}

    protected MyClass(final @Reflectable String name) {
        this.name = name;
    }

    @Reflectable
    private MyClass(String name, @Reflectable int age) {
        this.name = name;
        this.age = age;
    }

    @Override @Reflectable
    public int compareTo(@Reflectable MyClass o) {
        return 0;
    }
}

class A extends B {}
class B{}