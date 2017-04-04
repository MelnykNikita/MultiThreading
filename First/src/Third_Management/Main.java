package Third_Management;

public class Main {
    static {
        System.out.println("Start of MAIN Thread");
    }

    public static void main(String[] args) {
        JoinThread threadFirst = new JoinThread("First");
        JoinThread threadSecond = new JoinThread("Second");

        threadFirst.start();
        threadSecond.start();

        try {
            threadFirst.join();    //Main waiting for thread
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName());
    }

}
