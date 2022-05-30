package task19;

public class JustThread extends Thread {
    @Override
    public void run () {
        System.out.println("JustThread started");
        System.out.println("JustThread finished");
    }
}