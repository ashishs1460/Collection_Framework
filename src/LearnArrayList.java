import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearnArrayList {
    public static void main(String[] args) {
        //ArrayList is  an array without fixed size, we can say it as a dynamic array
        // Initially when an arraylist is initialized it creates an array of size 10
        // As it get fulls the size  new arraylist of size almost double the original size is created
        // All the elements get copied in to the new array and the old array get deleted.

        List<String> list =  new ArrayList<>();
        list.add("Ashish");
        list.add("Bigin");
        System.out.println(list);
        // add value at an index
        list.add(1,"Mohanlal");
        //update the value at an index
        list.set(1,"Mammotty");
        System.out.println(list);

        // we can add an entire list in to another list
        List<String> numbers = new ArrayList<>();
        numbers.add("Akshay Krishna");
        numbers.add("Ajil Daniel");
        list.addAll(numbers);

        System.out.println(list);

        // In order to get an element at an index
        System.out.println(list.get(2));

        //To check weather an element present in the list or not
        boolean result =list.contains("Ashish");
        System.out.println(result);


        // To remove an element from a list
        list.remove(0);
        list.remove("Bigin");
        System.out.println(list);

        //we can iterate through the list in 3 ways
        // 1. for loop
        for(int i =0;i<list.size();i++){
            System.out.println("Elements in the list is "+list.get(i));
        }
        System.out.println(">>>>>>>>>>>>>>>>>>");
        // 2. for each loop
        for(String element : list){
            System.out.println("Elements in the list using for each "+element);
        }
        System.out.println(">>>>>>>>>>>>>>>>>>");
        //3. Using Iterator : we have an iterator in every collection framework
        Iterator<String> it = list.iterator();
        //This Iterator interface has a method called hasNext() : it is used to check
        // weather there is next element is the list
        // There is also one method called next() : it is used to print the next element in the list
        while (it.hasNext()){
            System.out.println("Iterator "+it.next());
        }



        // To remove the entire list
        list.clear();
        System.out.println(list);
    }
}
