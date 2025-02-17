package Multithreading;

public class RunnableDemo implements Runnable{

    public static void main(String[] args) {
        RunnableDemo rd = new RunnableDemo();
        Thread t = new Thread(rd);

        t.start();
    }

    @Override
    public void run() {
        System.out.println("process was checked");
    }
}
