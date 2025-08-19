
public class Sandbox {

    public static void main(String[] args) {
        // Write your program here

    int beginning = 1;
    int end = 5;

    printStars(beginning, end);
}

public static void printStars(int beginning, int end) {
    while (beginning < end) {
        System.out.print("*");
        beginning++; // same as beginning = beginning + 1
    }
}

}
    

