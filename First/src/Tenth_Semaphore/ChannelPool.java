package Tenth_Semaphore;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class ChannelPool<T> {
        private final static int POOL_SIZE = 5;
        private final Semaphore semaphore = new Semaphore(POOL_SIZE, true);
        private final Queue<T> resources = new LinkedList<T>();

        public ChannelPool(Queue<T> source) {
            resources.addAll(source);
        }

        public T getResource(long maxWaitMillis) throws ResourceException {
            try {
                if (semaphore.tryAcquire(maxWaitMillis, TimeUnit.MILLISECONDS)) {
                    T result = resources.poll();
                    return result;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            throw new ResourceException("Waiting time exceeded");
        }

        // Add instance to Resources
        public void returnResource(T result) {
            resources.add(result);
            semaphore.release();
        }
}
