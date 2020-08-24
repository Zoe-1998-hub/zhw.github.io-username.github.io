package itcast;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

public class CallableDemo {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(2);
        pool.submit(new MyCallable());
        pool.submit(new MyCallable());

        pool.shutdown();
    }

}
