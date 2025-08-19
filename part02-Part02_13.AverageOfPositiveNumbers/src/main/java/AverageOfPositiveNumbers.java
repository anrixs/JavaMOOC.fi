
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int number = 0;
        
        
        while(true) {
            int input = Integer.valueOf(scanner.nextLine());
            
            if (input == 0) {
                break;  
            }

            if (input > 0) {
                number++;
                sum = sum + input;
            }
        }
        
        if (number > 0) {
            double average = (1.0 * sum) / number;
            System.out.println(average);
        } else {
            System.out.println("Cannot calculate the average");
        }
    }
}
