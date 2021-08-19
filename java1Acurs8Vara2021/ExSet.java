import java.util.*;
public class ExSet {
    public static void main(String [] args) {
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10);
        set.forEach(System.out::println);
    }
}