package miscellaneous.producerConsumer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class Producer implements Runnable{
    BlockingQueue<Integer> queue;
    public Producer(BlockingQueue<Integer> obj)
    {
        this.queue = obj;
    }
    public void run()
    {
        for (int i = 1; i <= 4; i++) {
            try {
                Thread.sleep(200);
                queue.put(i);
                System.out.println("Produced " + i);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer implements Runnable{
    BlockingQueue<Integer> queue;
    public Consumer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    int taken = -1;
    @Override
    public void run() {

        while (taken != 4){
            try {
                Thread.sleep(500);
                taken = queue.take();
                System.out.println("item consumed is ::"+taken);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}

public class ProducerConsumerTest {

    public static void main(String[] args) {
        BlockingQueue<Integer> bqueue = new ArrayBlockingQueue<Integer>(4);
        Producer p1 = new Producer(bqueue);
        Consumer c1 = new Consumer(bqueue);
        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(c1);
        t1.start();
        t2.start();
    }



}


