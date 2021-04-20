package com.shashi.example;

public class MultithreadDemo implements Runnable {

    private Thread t;
    private String threadName;

    /**
     * initailizing the thread name
     * 
     * @param threadName
     * 
     * @author Shashi Kumar
     * @version 1.0
     * @since 2021-04-18
     */
    public MultithreadDemo(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out.println("Running " + threadName);
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("Thread: " + threadName + ", " + i);

                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            System.out.println("Thread " + threadName + " interrupted.");
        }

        System.out.println("Thread " + threadName + "exiting.");

    }

    public void start() {
        System.out.println("starting " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }

    }

}