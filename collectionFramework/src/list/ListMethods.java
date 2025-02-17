package list;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i=10; i<=100; i=i+10) {
            list.add(i);
        }
        System.out.println("list:"+list);

        //mehod for add
        list.add(2,100);
        System.out.println("list:"+list);

        //method for replacing
        list.set(3,200);
        System.out.println("list:"+list);

        List<Integer> secondlist = new ArrayList<>();
        secondlist.add(111);
        secondlist.add(222);
        secondlist.add(333);
        System.out.println("secondlist:"+secondlist);

        //method for inserting a list in another list to any index
        list.addAll(4,secondlist);

        System.out.println("first list:"+list);

        //method for checking that value was in the list or not
        if(list.contains(222)) {
            System.out.println("list has a vlaue");
        } else {
            System.out.println("list don't has a value");
        }

        for (int i=0; i< list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        System.out.println();

        //method for remove an element
        list.remove(3);
        System.out.println("list after deletion:" + list);
    }
}
