package concurrencyinpractice.chapter05;

import java.util.concurrent.TimeUnit;

public class InterruptExample3 {

    public static void main(String[] args) {
        // Creates a FileClock runnable object and a Thread
        // to run it
        FileClock3 clock=new FileClock3();
        Thread thread=new Thread(clock);

        // Starts the Thread
        thread.start();
        try {
            // Waits five seconds
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        };
        // Interrupts the Thread
        thread.interrupt();
    }
}