
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Last number?");
        int userInput = Integer.valueOf(scanner.nextLine());
        int result = 0;
        
        for (int i =0; i <= userInput; i++) {
            result += i;
        }
        System.out.println(result);
    }
}
