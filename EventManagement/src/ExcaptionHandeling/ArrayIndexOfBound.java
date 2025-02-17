package ExcaptionHandeling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ArrayIndexOfBound {

    public static void main(String[] args) {
        int a[] = {1,2,3};
        try {
            FileInputStream file = new FileInputStream("");
            for(int i=0; i<= a.length; i++) {
                System.out.println(a[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("please check the correct length of array");
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        } finally {
            System.out.println("finally i learn a excaption handling");
        }

        System.out.println("more code is run");
    }
}
