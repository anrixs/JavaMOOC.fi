import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        Scanner scanner = new Scanner(System.in);
        // book information and to examine them
        ArrayList<Book> bookInformation = new ArrayList<>();
        
        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();
            
            if (title.isEmpty()) {
                break;
            }
            
            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            
            System.out.print("Publication year: ");
            int year = Integer.valueOf(scanner.nextLine());
            
            bookInformation.add(new Book(title, pages, year));
        }
        
        System.out.print("What information will be printed? ");
        String information = scanner.nextLine();
        
        for (Book info: bookInformation) {
            if (information.contains("everything")) {
                System.out.println(info);
            } else if (information.contains("name")) {
                System.out.println(info.getName());
            }
        }  
    }
}
