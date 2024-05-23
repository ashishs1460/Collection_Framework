import java.util.Iterator;
import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();
        animals.push("Dog");
        animals.push("Cat");
        animals.push("Goat");
        animals.push("Cow");
        System.out.println(animals);
        System.out.println(">>>>>>");

        for(String animal : animals){
            System.out.println(animal);
        }

        System.out.println(">>>>>>");

        for(int i = 0;i<animals.size();i++){
            System.out.println(animals.get(i));
        }

        System.out.println(">>>>>>>");
        Iterator<String> iterator = animals.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println(animals.peek()+" Peeked animal from the stack!");

        animals.pop();
        animals.pop();


        System.out.println(animals);

    }
}
