
import java.util.Scanner;


public class UserInterface {
    private TodoList toDoList;
    private Scanner scanner;
    
    public UserInterface(TodoList toDoList, Scanner scanner) {
        this.toDoList = toDoList;
        this.scanner = scanner;
    }
    
    public void start() {
        while (true) {
            System.out.println("Command: ");
            String input = scanner.nextLine();
            
            if (input.contains("stop")) {
                break;
            }
            if (input.contains("add")) {
                System.out.println("To add: ");
                String addInput = scanner.nextLine();
                this.toDoList.add(addInput);
            }
            if (input.contains("list")) {
                this.toDoList.print();
            }
            if (input.contains("remove")) {
                System.out.println("Which one is removed? ");
                int removedInput = Integer.valueOf(scanner.nextLine());
                this.toDoList.remove(removedInput);
            }
        }
    }
}
