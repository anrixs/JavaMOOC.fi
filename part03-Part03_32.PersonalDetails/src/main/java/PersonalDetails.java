
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String longestName = "";
        int maxLength = 0;
        int sum = 0;
        int count = 0;
        
        while (true) {
            String input = scanner.nextLine();
            
            if (input.equals("")) {
                break;
            }
            
            String[] split = input.split(",");
            sum = sum + Integer.valueOf(split[1]);
            count++;
            
            
            for (String name: split) {
                if (name.length() > maxLength) {
                    maxLength = name.length();
                    longestName = name;
                }
            }  
        }
        System.out.println("Longest name: " + longestName);
        
        if (count > 0) {
            System.out.println("Average of the birth years: " + (1.0 * sum / count));
        }
    }
}
