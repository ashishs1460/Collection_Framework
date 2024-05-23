import java.util.HashMap;
import java.util.Map;

public class LearnMap {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(4,"Nithya");
        map.put(1,"Ashish");
        map.put(2,"Jeshma");
        map.put(3,"Bigin Raj");

        System.out.println(map);
        // How to iterate through a map
        for(Map.Entry<Integer,String> e : map.entrySet()){
            System.out.print(e.getKey()+" ");
            System.out.println(e.getValue());
        }
        System.out.println(">>>>>>>>>>>>>>>>>");
        // pre build methods available
        System.out.println(map.isEmpty());
        System.out.println(map.containsKey(22));
        System.out.println(map.containsValue("Jeshma"));

        // If we don't want to override the value of an existing key
        map.putIfAbsent(5,"Ashish");

        //Iterating key
        for(Integer key : map.keySet()){
            System.out.println(map.get(key));
        }
        //How to empty a map
        map.clear();
        System.out.println(map);
    }
}
