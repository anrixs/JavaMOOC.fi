
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // insert test code here
        //int[] array = {3, 1, 5, 99, 3, 12};
        int[] numbers1 = {8, 3, 7, 9, 1, 2, 4};
        System.out.println(Arrays.toString(numbers1));
        Main.sort(numbers1);
        System.out.println(Arrays.toString(numbers1));

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(8);
        numbers.add(3);
        numbers.add(7);
        System.out.println(numbers);
        Main.sortIntegers(numbers);
        System.out.println(numbers);

        ArrayList<String> strings = new ArrayList<>();
        strings.add("What did you eat at breakfast?");
        strings.add("How was your day?");
        strings.add("Hello World!");
        System.out.println(strings);
        Main.sortStrings(strings);
        System.out.println(strings);
    }

    public static void sort(int[] array) {
        Arrays.sort(array);
    }

    public static void sort(String[] array) {
        Arrays.sort(array);
    }

    public static void sortIntegers(ArrayList<Integer> integers) {
        Collections.sort(integers);
    }

    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);
    }
}
