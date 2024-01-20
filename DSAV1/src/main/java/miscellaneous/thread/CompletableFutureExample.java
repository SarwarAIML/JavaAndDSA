package miscellaneous.thread;


import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureExample {


    public static void main(String[] args) {


        CompletableFuture<String> helloFuture = CompletableFuture.supplyAsync(()->"Hello");
        CompletableFuture<String> greetingFuture = CompletableFuture.supplyAsync(() -> "World");

        CompletableFuture<String> combinedFuture = helloFuture.thenCombine(greetingFuture, (m1, m2) -> m1 + " " + m2);

        try {
            System.out.println(combinedFuture.get());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }


}