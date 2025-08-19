
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        int n = 0;
        while (true) {
            String input = scanner.nextLine();
            
            if (input.equals("")) {
                break;
            }
            
            String[] split = input.split(",");
            
            age = Integer.valueOf(split[1]);
            
            if (age > n) {
                n = age;
            }
            }
            System.out.println("Age of the oldest: " + n);
    }
}
