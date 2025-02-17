package Yeild;

public class YeildDemo extends Thread {

    public void run() {
        for (int i=0; i<=4; i++) {
            System.out.println(Thread.currentThread().getName()+":"+" "+i);
            Thread.yield();
        }
    }

    public static void main(String[] args) {
        YeildDemo t1 = new YeildDemo();
        YeildDemo t2 = new YeildDemo();

        t1.start();
        t2.start();

    }


}
