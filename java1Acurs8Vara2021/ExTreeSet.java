import java.util.*;
public class ExTreeSet {
    public static void main(String [] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10);
        set.forEach(System.out::println);
        
        Comparator<Angajat> c = new Comparator<>(){
            public int compare(Angajat a1, Angajat a2) {
                return a1.nume.compareTo(a2.nume);
            }
        };
        
        Set<Angajat> set1 = new TreeSet<>();
        set1.add(new Angajat("Popescu",45));
        set1.add(new Angajat("Ionescu",30));
        set1.add(new Angajat("Alexandrescu",50));
        set1.add(new Angajat("Grigorescu",23));
        
        Set<Angajat> set2 = new TreeSet<>(c);
        Set<Angajat> set3 = new TreeSet<>((a1,a2) -> a1.nume.compareTo(a2.nume));
        set3.add(new Angajat("Popescu",45));
        set3.add(new Angajat("Ionescu",30));
        set3.add(new Angajat("Alexandrescu",50));
        set3.add(new Angajat("Grigorescu",23));
        
        set1.forEach(System.out::println);
        set3.forEach(System.out::println);
    }
}