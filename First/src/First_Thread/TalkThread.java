package First_Thread;

public class TalkThread extends Thread {
    public void run() {
        for (int i=0; i < 10; i++) {
            System.out.println(i + "Talking");
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                System.err.print(e);
            }
        }

    }
}
