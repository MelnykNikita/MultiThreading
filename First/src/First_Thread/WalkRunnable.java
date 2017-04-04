package First_Thread;

public class WalkRunnable implements Runnable {

    @Override
    public void run() {
        for (int i=0; i < 10; i++) {
            System.out.println(i + "Walking");
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                System.err.print(e);
            }
        }
    }
}
