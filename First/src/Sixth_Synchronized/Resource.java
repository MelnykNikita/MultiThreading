package Sixth_Synchronized;

import java.io.FileWriter;
import java.io.IOException;

public class Resource {

    private FileWriter fileWriter;

    public Resource(String file) throws IOException {
        fileWriter = new FileWriter(file, true);
    }

    public synchronized void writing(String str, int i) {
        try {
            fileWriter.append(str + i);
            System.out.print(str + i);
            Thread.sleep((long)(Math.random()*50));
            fileWriter.append("->" + i + "\t");
            System.out.println("->" + i + "\t");

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException exc) {
            exc.printStackTrace();
        }
    }

    public void close() {
        try {
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
