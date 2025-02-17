package Multithreading;

public class SingleThreaded {

    public static void main(String[] args) {
        SingleThreaded st = new SingleThreaded();
        st.printNum();

        for (int j=0; j<=200; j++) {
            System.out.println("j: " + j);
        }
    }

    void printNum() {
        for (int i=0; i<=200; i++) {
            System.out.println("i:" + i);
        }
    }
}
