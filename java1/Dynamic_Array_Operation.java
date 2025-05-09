import java.util.ArrayList;
import java.util.Collections;

public class Dynamic_Array_Operation{
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        System.out.println("After adding: " + numbers);

        numbers.remove(2); 
        System.out.println("After removing index 2: " + numbers);

        int element = numbers.get(1); 
        System.out.println("Element at index 1: " + element);

        int size = numbers.size();
        System.out.println("Size of list: " + size);

        Collections.rotate(numbers, 2);
        System.out.println("After rotating right by 2: " + numbers);

        if (!numbers.isEmpty()) {
            int first = numbers.remove(0);
            numbers.add(first);
        }
        System.out.println("After shifting left by 1: " + numbers);
    }
}
 
