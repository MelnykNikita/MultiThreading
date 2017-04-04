package Second_Priority;

public class PriorThread extends Thread{
    public PriorThread(String name) {
        super(name);
    }
    public void run() {
        for (int i = 0; i < 80; i++) {
            System.out.println(getName() + "\t" + i);
        }
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            System.err.print(e);
        }
    }
}
