
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        int n = 0;
        String name = "";
        while (true) {
            String input = scanner.nextLine();
            
            if (input.equals("")) {
                break;
            }
            
            String[] split = input.split(",");
            age = Integer.valueOf(split[1]); // index 1 is numbers
            if (age > n) {
                n = age;
                name = split[0]; //index 0 is strings
            }
        }
        System.out.println("Name of the oldest: " + name);

    }
}
