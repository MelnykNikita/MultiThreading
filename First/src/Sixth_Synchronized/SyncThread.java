package Sixth_Synchronized;

public class SyncThread extends Thread {

    private Resource resource;

    public SyncThread(String name, Resource resource) {
        super(name);
        this.resource = resource;
    }

    public void run() {
        for(int i = 1; i < 6; i++) {
            resource.writing(getName(), i);
        }
    }
}
