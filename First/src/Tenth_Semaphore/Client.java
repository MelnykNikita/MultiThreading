package Tenth_Semaphore;

public class Client extends Thread {
        private boolean reading = false;
        private ChannelPool<AudioChannel> pool;

        public Client(ChannelPool<AudioChannel> pool) {
            this.pool = pool;
        }

        @Override
        public void run() {
            AudioChannel channel = null;
            try {
                channel = pool.getResource(1000); //try 100, 500, 1000
                reading = true;
                System.out.println("Channel Client #" + this.getId() + " took channel #" + channel.getChannelID());
                channel.using();
            } catch (ResourceException e) {
                System.out.println("Client #" + this.getId() + " lost ->" + e.getMessage());
            } finally {
                if (channel != null) {
                    reading = false;
                    System.out.println("Channel Client #" + this.getId() + " : "
                            + channel.getChannelID() + "channel released");
                    pool.returnResource(channel);
                }
            }
        }

        public boolean isReading() {
            return reading;
        }
}
