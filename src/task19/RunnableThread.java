package task19;

public class RunnableThread implements Runnable {
    @Override
    public void run() {
        System.out.println("RunnableThread started");
        System.out.println("RunnableThread finished");
    }
}