package misc.javaPapers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DoubleBraceInitializationExample {
    public static void main(String[] args) {
        final Set<Integer> set1 = new HashSet<Integer>() {{
            add(1);
            add(2);
            add(3);
        }};
 
        final Set<Integer> set2 = new HashSet<Integer>() {{
            add(1);
            add(2);
            add(3);
        }};
 
        final List<Integer> list1 = new ArrayList<Integer>() {{
            add(4);
            add(5);
            add(6);
        }};
 
        final List<Integer> list2 = new ArrayList<Integer>() {{
            add(4);
            add(5);
            add(6);
        }};
 
        System.out.println(set1);
        System.out.println(set2);
        System.out.println(list1);
        System.out.println(list2);
    }
}