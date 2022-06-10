package task20;

public class Singleton {
    private int a = 1;
    private int b = 2;
    private int c = 3;

    private Singleton() {
    }

    public static Singleton instance() {
        return Holder.INSTANCE;
    }

    @Override
    public String toString() {
        return "Singleton{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", hashCode=" + this.hashCode() +
                '}';
    }

    private static class Holder {
        static final Singleton INSTANCE = new Singleton();
    }
}
