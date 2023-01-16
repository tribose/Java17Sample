package queue.blockingqueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadLocalRandom;

public class NumberProducers implements Runnable {

    private final int poisonPill;
    private final int poisonPillPerProducer;
    private BlockingQueue<Integer> producerQueue;

    public NumberProducers(BlockingQueue<Integer> producerQueue, int poisonPill, int poisonPillPerProducer) {
        this.producerQueue = producerQueue;
        this.poisonPill = poisonPill;
        this.poisonPillPerProducer = poisonPillPerProducer;
    }

    @Override
    public void run() {
        try {
            generateNumbers();
        } catch (InterruptedException ex) {
            System.out.println("interrupted exception in producer");
            Thread.currentThread().interrupt();
        }
    }

    protected void generateNumbers() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            this.producerQueue.put(ThreadLocalRandom.current().nextInt(100));
        }
        for (int j = 0; j < poisonPillPerProducer; j++) {
            this.producerQueue.put(poisonPill);
        }
    }
}
