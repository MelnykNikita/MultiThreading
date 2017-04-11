package Tenth_Semaphore;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<AudioChannel> list = new LinkedList<AudioChannel>() {
            {
                this.add(new AudioChannel(111));
                this.add(new AudioChannel(222));
                this.add(new AudioChannel(333));
                this.add(new AudioChannel(444));
                this.add(new AudioChannel(555));
            }
        };

        ChannelPool<AudioChannel> pool = new ChannelPool<>(list);
        for (int i = 0; i < 20; i++) {
            new Client(pool).start();
        }
    }
}
