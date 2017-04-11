package Tenth_Semaphore;

import java.util.Random;

public class AudioChannel {
    private int channelID;

    public AudioChannel(int channelID) {
        super();
        this.channelID = channelID;
    }

    public int getChannelID() {
        return channelID;
    }

    public void setChannelID(int channelID) {
        this.channelID = channelID;
    }

    public void using() {
        try {
            Thread.sleep(new Random().nextInt(500));
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}
