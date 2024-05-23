import java.util.HashSet;
import java.util.Set;

public class CustomSet {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        students.add(new Student("Ashish",24));
        students.add(new Student("Bigin Raj",33));
        students.add(new Student("Ashish",24));
        System.out.println(students);
    }
}
