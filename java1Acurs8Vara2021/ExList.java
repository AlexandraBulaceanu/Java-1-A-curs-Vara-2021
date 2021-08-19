import java.util.*;
public class ExList {
    public static void main(String [] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);//0
        list.add(34);//1
        list.add(7);//2
        list.add(5);//3
        list.add(7);//4
        list.add(2);//5
        
        System.out.println("Dimensiunea listei: "+list.size());
        System.out.println("Exista elem in colectie? "+list.isEmpty());
        System.out.println("Valoarea de la pozitia 3: "+list.get(3));
        System.out.println("==================");
        for(int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("==================");
        for(Integer elem:list) {
            System.out.println(elem);
        }
        System.out.println("==================");
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext())  {
            System.out.println(iterator.next());
        }
        System.out.println("==================");
        list.forEach(e->System.out.println(e));
        System.out.println("==================");
        list.remove(5);
        list.forEach(System.out::println);
        System.out.println("==================");
        list.remove(new Integer(5));
        list.forEach(System.out::println);
        
        //LinkedList -> lista inlantuita -> coada+stiva
        //add, addFirst, addLast, getFirst, getLast, removeFirst, removeLast
        //COADA -> FIFO(FIRST IN FIRST OUT)
        //STIVA -> LIFO(LAST IN FIRST OUT)
    }
}