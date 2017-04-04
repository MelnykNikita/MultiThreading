package Fourth_Daemons;

public class Main {
    public static void main(String[] args) {
        SimpleThread usualThread = new SimpleThread();
        SimpleThread daemon = new SimpleThread();

        daemon.setDaemon(true);
        daemon.start();
        usualThread.start();
        System.out.println("Main end");
    }
}
