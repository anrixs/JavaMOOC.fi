
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int number = 0;
        double average = 0;
                
        while (true) {
            System.out.println("Give a number:");
            int input = Integer.valueOf(scanner.nextLine());
            
            if (input == 0) {
                break;
            }
            if (input > 0 || input < 0) {
                sum += input;
                number++;
                
            }
            if (input > 0 || input < 0) {
                average = (1.0 * sum) / number;
            }
            
        }
        System.out.println("Average of the numbers: " + average);

    }
}
