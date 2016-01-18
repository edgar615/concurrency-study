package concurreny.forkjoin;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;

/**
 * Created by Administrator on 2014/11/26.
 */
public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CountTask countTask = new CountTask(1, 10);
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        Future<Integer> future = forkJoinPool.submit(countTask);
        System.out.println(future.get());
    }
}
