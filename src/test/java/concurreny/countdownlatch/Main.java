package concurreny.countdownlatch;

import java.util.concurrent.CountDownLatch;

/**
 * Created by Administrator on 2014/11/26.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(3);

        Waiter      waiter      = new Waiter(latch);
        Decrementer decrementer = new Decrementer(latch);

        new Thread(waiter)     .start();
        new Thread(decrementer).start();

        Thread.sleep(4000);
    }
}
