package Third_Management;

public class JoinThread extends Thread {
    public JoinThread(String name) {
        super(name);
    }
    public void run() {
        String threadName = getName();
        long timeout = 0;
        System.out.println("Start of thread: " + threadName);
        try {
            switch (threadName) {
                case "First":
                    timeout = 5000;
                case "Second":
                    timeout = 1000;
            }
            Thread.sleep(timeout);
            System.out.println("End of thread: " + threadName);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }

    }
}
