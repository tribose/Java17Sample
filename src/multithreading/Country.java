package multithreading;

public class Country implements Runnable {
    public static void main(String[] args) throws InterruptedException {
        Country c1 = new Country();
        Country c2 = new Country();
        Country c3 = new Country();
        Country c4 = new Country();
        Country c5 = new Country();
        Country c6 = new Country();

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        Thread t3 = new Thread(c3);
        Thread t4 = new Thread(c4);
        Thread t5 = new Thread(c5);
        Thread t6 = new Thread(c6);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
    }

    public void  m1() {
        synchronized (this) {
            try {
                System.out.println(Thread.currentThread().getName() + " Started");
                Thread.sleep(5000);
                System.out.println(Thread.currentThread().getName() + " Finished");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void run() {
        m1();
    }
}
