package miscellaneous.thread;

public class PrintNumberANdLatter {
    public static final Object lock = new Object();

    public static void main(String[] args) {
        Thread thread = new Thread(PrintNumberANdLatter::printNumber);
        Thread thread1 = new Thread(PrintNumberANdLatter::printCharacter);
        thread.start();
        thread1.start();
    }

    public static void printNumber(){
        synchronized (lock){

            for (int i = 1; i <=5 ; i++) {
                System.out.print(i+"-");
                lock.notify();
                if (i< 5){
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

            }
        }
    }

    public static void printCharacter(){
        synchronized (lock) {
            for (char ch = 'a'; ch <= 'e'; ch++) {
                System.out.print(ch+" ");
                lock.notify();
                if (ch < 'e') {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }


}