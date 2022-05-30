package task19;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Starter {
    public static void startJustThread() {
        JustThread tt = new JustThread();
        tt.setDaemon(true);
        tt.start();
    }

    public static void startRunnableThread() {
        RunnableThread rt = new RunnableThread();
        Thread thread = new Thread(rt);
        thread.start();
    }

    public static void CallableThread() {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        CallableThread ct = new CallableThread();
        Future<String> future = executorService.submit(ct);
    }

    public static void startAnonymousThread() {
        Thread t = new Thread() {
            @Override
            public void run() {
                System.out.println("AnonymousThread started");
                System.out.println("AnonymousThread finished");
            }
        };
        t.start();
    }
}