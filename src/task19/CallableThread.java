package task19;

import java.util.concurrent.Callable;

public class CallableThread implements Callable<String> {
    @Override
    public String call() {
        System.out.println("CallableThread started");
        System.out.println("CallableThread finished");
        return null;
    }
}