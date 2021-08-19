import java.util.*;
public class ExMap {
    public static void main(String [] args) {
        Map<Integer,String> map = new HashMap<>(); //(LinkedHashMap, TreeMap)
        map.put(12,"Bucuresti");
        map.put(10,"Alexandria");
        map.put(20,"Brasov");
        map.put(8,"Constanta");
        map.put(10,"Timisoara");
        Set<Integer> keys = map.keySet();//setul de chei(au valori unice)
        for(Integer k:keys) {
            System.out.println(k+" "+map.get(k));
        }
        System.out.println("==================");
        map.forEach((k,v)->System.out.println(k+" "+v));
        
        List<Integer> list1 = Arrays.asList(5,6,7,8,9);
        //J9
        List<Integer> list = List.of(10,30,7,2,14);//set, map
        //J10
        var list2 = new ArrayList<Integer>();
        //list2 = new ArrayList<String>();
    }
}