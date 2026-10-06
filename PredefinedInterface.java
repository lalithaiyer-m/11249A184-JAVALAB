import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PredefinedInterface {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(30);
        numbers.add(10);
        numbers.add(20);

        System.out.println("Before sorting: " + numbers);

        // Collections.sort() uses the predefined Comparable interface
        Collections.sort(numbers);

        System.out.println("After sorting: " + numbers);
    }
}