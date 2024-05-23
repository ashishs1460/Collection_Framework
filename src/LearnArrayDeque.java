import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

public class LearnArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.offer(4); // we can also use dq.offerLast(4)
        dq.offer(6);
        dq.offer(8);
        dq.offerFirst(10);
//        Iterator<Integer> iterator = dq.iterator();
//        while (iterator.hasNext()){
//            System.out.print(iterator.next()+"<---");
//        }
        System.out.println(dq);
//        dq.poll();
        dq.pollLast();
        System.out.println(dq);
    }
}
