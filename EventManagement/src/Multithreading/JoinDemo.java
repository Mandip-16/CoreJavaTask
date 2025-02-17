package Multithreading;

public class JoinDemo extends Thread {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        JoinDemo jd1 = new JoinDemo();
        JoinDemo jd2 = new JoinDemo();

        String currentThreadname = Thread.currentThread().getName();
        System.out.println("thread name is: " + currentThreadname);

        jd1.start();
        jd2.start();

        try {
            jd1.join();
            jd2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("code is done!");
        long end = System.currentTimeMillis();
        System.out.println("total time taken to run code: " + (end -start)/1000 + " "+"seconds");
    }

    public void run() {
        String currentThreadname = Thread.currentThread().getName();
        System.out.println("thread name is: " + currentThreadname);
//        for (int i=0; i<=200; i++) {
//            System.out.println("i: "+i);
//        }
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
   }
}
