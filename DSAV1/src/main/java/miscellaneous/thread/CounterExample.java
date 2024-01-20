package miscellaneous.thread;

import java.util.concurrent.atomic.AtomicInteger;

public class CounterExample {
    private static AtomicInteger count = new AtomicInteger(0);

    public static void main(String[] args) {
        // Create multiple threads to update the count concurrently
        Thread thread1 = new Thread(CounterExample::incrementCount);
        Thread thread2 = new Thread(() -> incrementCount());

        // Start the threads
        thread1.start();
        thread2.start();

        // Wait for the threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the final count
        System.out.println("Final Count: " + getCount());
    }

    private static void incrementCount() {
        for (int i = 0; i < 10000; i++) {
            // Atomic increment operation
            count.incrementAndGet();
        }
    }

    private static int getCount() {
        // Atomic get operation
        return count.get();
    }
}