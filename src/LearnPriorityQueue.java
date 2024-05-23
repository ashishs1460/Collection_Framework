import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {
    public static void main(String[] args) {
//      Queue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder()); //( this is for max heap)
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(34);
        priorityQueue.offer(12);
        priorityQueue.offer(56);
        priorityQueue.offer(46);
        // under the hood min heap data structure is being implemented here
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue);
    }
}
