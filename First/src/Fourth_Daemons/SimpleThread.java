package Fourth_Daemons;

public class SimpleThread extends Thread {

    public void setDaemon() {
        this.setDaemon(true);
    }

    public void run() {
        try {
            if (isDaemon()) {
                System.out.println("Start of Daemon");
                Thread.sleep(10000);
            } else {
                System.out.println("Start of usual Thread");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (!isDaemon()) {
                System.out.println("End of usual Thread");
            } else {
                System.out.println("End of Daemon");
            }
        }
    }
}
