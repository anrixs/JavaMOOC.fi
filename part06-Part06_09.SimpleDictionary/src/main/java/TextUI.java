
import java.util.Scanner;

public class TextUI {

    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {

        while (true) {
            System.out.println("Command: ");
            String word = scanner.nextLine();

            if (word.contains("end")) {
                break;
            } else if (word.contains("add")) {
                System.out.println("Word: ");
                String commandWord = scanner.nextLine();
                System.out.println("Translation: ");
                String translation = scanner.nextLine();
                this.dictionary.add(commandWord, translation);
            } else if (word.contains("search")) {
                System.out.println("To be translated: ");
                String searchFor = scanner.nextLine();
                String translation = this.dictionary.translate(searchFor);
                if (translation == null) {
                    System.out.println("Word " + searchFor + " was not found");
                } else {
                    System.out.println("Translation: " + translation);
                }
            } else {
                System.out.println("Unknown command");
            }
        }
        System.out.println("Bye bye!");
    }
}
