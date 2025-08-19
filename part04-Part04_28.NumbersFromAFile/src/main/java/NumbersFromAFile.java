
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;


public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        int counter = 0;
        try (Scanner reader = new Scanner(Paths.get(file))) {
            while (reader.hasNextLine()) {
                String row = reader.nextLine();
                int numbers = Integer.valueOf(row);
                
                if (numbers >= lowerBound && numbers <= upperBound) {
                    counter++;
                }
            }
            System.out.println("Numbers: " + counter);
            
        } catch (IOException ex) {
            System.out.println("Error: " + ex);
        }

    }

}
