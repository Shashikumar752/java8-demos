package com.shashi.example;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        MultithreadDemo demo1 = new MultithreadDemo("Thread-1");
        demo1.start();

        MultithreadDemo demo2 = new MultithreadDemo("Thread-2");
        demo2.start();
    }
}
