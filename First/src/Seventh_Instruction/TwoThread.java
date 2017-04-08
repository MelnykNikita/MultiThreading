package Seventh_Instruction;

public class TwoThread {
    static int counter = 0;
    public static void main(String[] args) {
        final StringBuilder s = new StringBuilder();
        new Thread() {
            @Override
            public void run() {
                synchronized (s) {
                    do {
                        s.append("A");
                        System.out.println(s);
                            try {
                                Thread.sleep(100);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                    } while (TwoThread.counter++ < 2);
                }
            }
        }.start();
        new Thread() {
            @Override
            public void run() {
                synchronized (s) {
                    while (TwoThread.counter++ < 6) {
                        s.append("B");
                        System.out.println(s);
                    }
                }
            }
        }.start();
    }
}
