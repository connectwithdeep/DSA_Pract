import java.util.*;
public class collections_functions {
    public static void main(String[] args) {
        List<Integer> l=new ArrayList<>();
        l.add(2);
        l.add(3);
        l.add(9);
        l.add(8);
        l.add(2);
        System.out.println(Collections.min(l));
        System.out.println(Collections.max(l));
        System.out.println(Collections.frequency(l, 2));
        Collections.sort(l); //Collections.sort(l,Comparator.reverseOrder()); for desc order
        System.out.println(l);
    }
}
