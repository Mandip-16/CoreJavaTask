package ExcaptionHandeling;

import java.util.Scanner;

public class Excaption {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        try{
            int result = a/b;
            System.out.println("result is : " + result);
        } catch (ArithmeticException e) {
            System.out.println("don't divide by 0!");
        }
        System.out.println("more code is run also excsption was handled!");
    }
}
