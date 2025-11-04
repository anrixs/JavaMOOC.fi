
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};

        int[] numbers = {6, 5, 8, 7, 11};
        System.out.println("Smallest: " + MainProgram.smallest(numbers));
        System.out.println("");
        int[] numbers1 = {6, 5, 8, 7, 11};
        System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(numbers1));
        System.out.println("");
        int[] numbers2 = {-1, 6, 9, 8, 12};
        System.out.println(MainProgram.indexOfSmallestFrom(numbers2, 0));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers2, 1));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers2, 2));
        System.out.println("");
        int[] numbers3 = {3, 2, 5, 4, 8};
        System.out.println(Arrays.toString(numbers3));
        MainProgram.swap(numbers, 1, 0);
        System.out.println(Arrays.toString(numbers3));
        MainProgram.swap(numbers, 0, 3);
        System.out.println(Arrays.toString(numbers3));
        System.out.println("");
        int[] numbers4 = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers4);

    }

    public static int smallest(int[] array) {
        int smallest = Integer.MAX_VALUE;

        for (int number : array) {
            if (number < smallest) {
                smallest = number;
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int indexOfSmallest = 0;
        int smallestIndex = array[indexOfSmallest];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallestIndex) {
                smallestIndex = array[i];
                indexOfSmallest = i;
            }
        }
        return indexOfSmallest;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int indexOfSmallest = startIndex;
        int smallestIndex = table[startIndex];

        for (int i = startIndex; i < table.length; i++) {
            if (table[i] < smallestIndex) {
                if (table[i] < smallestIndex) {
                    smallestIndex = table[i];
                    indexOfSmallest = i;
                }
            }
        }
        return indexOfSmallest;
    }

    public static void swap(int[] array, int index1, int index2) {
        int swapper = array[index1];
        array[index1] = array[index2];
        array[index2] = swapper;
    }

    public static void sort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            int index = indexOfSmallestFrom(array, i);
            swap(array, i, index);
            System.out.println(Arrays.toString(array));
        }
    }
}
