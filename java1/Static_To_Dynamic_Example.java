import java.util.ArrayList;
import java.util.Collections;

public class Static_To_Dynamic_Example {
    public static void main(String[] args) {
        int[] staticArray = {10, 20, 30, 40, 50};

        ArrayList<Integer> dynamicArray = new ArrayList<>();
        for (int num : staticArray) {
            dynamicArray.add(num); 
        }

        System.out.println("Initial dynamic array: " + dynamicArray);

        dynamicArray.add(60);
        System.out.println("After add: " + dynamicArray);

        dynamicArray.remove(2); // removes 30
        System.out.println("After remove at index 2: " + dynamicArray);

        int element = dynamicArray.get(1);
        System.out.println("Element at index 1: " + element);

        int size = dynamicArray.size();
        System.out.println("Size: " + size);

        Collections.rotate(dynamicArray, 2);
        System.out.println("After rotate right by 2: " + dynamicArray);

        if (!dynamicArray.isEmpty()) {
            int first = dynamicArray.remove(0);
            dynamicArray.add(first);
        }
        System.out.println("After shift left by 1: " + dynamicArray);
    }
}
