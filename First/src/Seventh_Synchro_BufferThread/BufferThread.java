package Seventh_Synchro_BufferThread;

public class BufferThread {

    static int counter = 0;
    static StringBuffer stringBuffer = new StringBuffer();

    public static void main(String[] args) throws InterruptedException {
        new Thread() {
            @Override
            public void run() {
                synchronized (stringBuffer) {
                    while (BufferThread.counter++ < 3) {
                        stringBuffer.append("A");
                        System.out.print("> " + counter + " ");
                        System.out.println(stringBuffer);
                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }.start();
        Thread.sleep(100);
        while (BufferThread.counter++ < 6) {
            System.out.print("> " + counter + " ");
            stringBuffer.append("B");
            System.out.println(stringBuffer);
        }
    }
}
