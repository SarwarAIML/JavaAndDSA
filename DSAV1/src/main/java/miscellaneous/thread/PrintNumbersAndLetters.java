package miscellaneous.thread;

public class PrintNumbersAndLetters {

    private static final Object lock = new Object();
   // private static int counter = 1;

    public static void main(String[] args) {

        Thread thread1 = new Thread(() -> printNumber());
        Thread thread2 = new Thread(() -> printLetter());

        thread1.start();
        thread2.start();
    }

    private static void printNumber() {
        synchronized (lock) {
            for (int i = 1; i <= 5; i++) {
                System.out.print(i + "-");
                lock.notify(); // Notify the other thread to proceed
                try {
                    if (i < 5) {
                        lock.wait(); // Wait for the other thread to print its letter
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }



    private static void printLetter() {
        synchronized (lock) {
            for (char ch = 'a'; ch <= 'e'; ch++) {
                System.out.print(ch + " ");
                lock.notify(); // Notify the other thread to proceed
                try {
                    if (ch < 'e') {
                        lock.wait(); // Wait for the other thread to print its number
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}