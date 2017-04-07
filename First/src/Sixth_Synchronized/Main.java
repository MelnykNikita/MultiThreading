package Sixth_Synchronized;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        Resource resource = null;

        try {
            resource = new Resource("data/result.txt");
            SyncThread thread1 = new SyncThread("First", resource);
            SyncThread thread2 = new SyncThread("Second", resource);
            thread1.start();
            thread2.start();
            thread1.join();
            thread2.join();
        } catch(IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            resource.close();
        }
    }
}
