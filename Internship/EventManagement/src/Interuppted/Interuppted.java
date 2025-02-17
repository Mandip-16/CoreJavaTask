package Interuppted;

public class Interuppted extends Thread {

    public void run() {
        try{
            for (int i=0; i<=300; i++) {
                System.out.println(i);
                Thread.sleep(3000);
            }
        } catch (InterruptedException e){
            System.out.println("Interupption occur!");
        }
    }

    public static void main(String[] args) {
        Interuppted t1 = new Interuppted();

        t1.start();
        t1.interrupt();
    }
}
