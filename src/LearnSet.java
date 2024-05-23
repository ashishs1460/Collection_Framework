import java.util.*;

public class LearnSet {
    public static void main(String[] args) {
//        Set<Integer> set = new HashSet<>();
//        Set<Integer> set = new LinkedHashSet<>(); // here insertion order maintained
        Set<Integer> set = new TreeSet<>(); // here inserted elements are sorted
        set.add(54);
        set.add(34);
        set.add(104);
        set.add(63);
        set.add(84);
        set.add(100);
        System.out.println(set);
//        Iterator<Integer> iterator = set.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
        System.out.println(">>>>>");
//        for(Integer item : set){
//            System.out.println(item);
//        }
        set.add(84); // here this is a duplicate value so if we try to add a duplicate
        // element set will ignore that element
        set.remove(84);
        System.out.println(set.contains(63));
        System.out.println(set.isEmpty());
        set.clear();

        System.out.println(set);
    }
}
