package queue.blockingqueue;

import java.util.concurrent.BlockingQueue;

public class NumberConsumers implements Runnable {

    private final int poisonPill;
    private BlockingQueue<Integer> consumerQueue;

    public NumberConsumers(BlockingQueue<Integer> consumerQueue, int poisonPill) {
        this.consumerQueue = consumerQueue;
        this.poisonPill = poisonPill;
    }

    @Override
    public void run() {
        try {
            while (true) {
                Integer element = consumerQueue.take();
                System.out.println("Consumer element: " +element);
                if (element == poisonPill) {
                    System.out.println("poison pill " +poisonPill);
                    return;
                }
                System.out.println("Current thread: " +Thread.currentThread().getName() + ", " +element);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
