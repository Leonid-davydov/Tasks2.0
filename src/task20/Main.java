package task20;

public class Main {
    public static void main(String[] args) {
        executeThreads(initThreads());
    }

    private static Thread[] initThreads() {
        Runnable runnable = () -> System.out.println(Singleton.instance());
        Thread[] threads = {new Thread(runnable),
                            new Thread(runnable),
                            new Thread(runnable)};

        return threads;
    }

    private static void executeThreads(Thread[] threads) {
        for (Thread thread : threads) {
            thread.start();
        }
    }
}
