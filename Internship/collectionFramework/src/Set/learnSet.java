package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class learnSet {

    public static void main(String[] args) {
//        Set<Integer> set = new HashSet<>();
//        Set<Integer> set = new LinkedHashSet<>();
        Set<Integer> set = new TreeSet<>();

        set.add(23);
        set.add(12);
        set.add(3);
        set.add(45);
        set.add(33);

        System.out.println(set);
        set.remove(3);
        System.out.println(set);
        System.out.println(set.contains(23));
        System.out.println(set.isEmpty());
        System.out.println(set.size());
        set.clear();
        System.out.println(set);
    }
}
