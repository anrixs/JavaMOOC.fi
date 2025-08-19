
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;


public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Name of the file: ");
        String file = scanner.nextLine();
        
        try (Scanner reader = new Scanner(Paths.get(file))) {
            while (reader.hasNextLine()) {
                String row = reader.nextLine();
                
                String[] split = row.split(",");
                String name = split[0];
                int age = Integer.valueOf(split[1]);
                
                System.out.println(name + ", age: " + age + " years");
            }
        } catch (IOException ex) {
            System.out.println("Error: " + ex);
        }
    }
}
