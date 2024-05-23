import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedListQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Java");
        queue.offer("Python");
        queue.offer("Javascript");
        queue.offer("Dart");
        // offer is the method used to add element in to the queue, we can also use add()
        // but it throws as exception if the task is not completed

        System.out.println(queue.peek());

        System.out.println(queue);

        queue.poll();

        System.out.println(queue);
    }
}
