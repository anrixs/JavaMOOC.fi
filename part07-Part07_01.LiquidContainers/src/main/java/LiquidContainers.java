
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int container1 = 0;
        int container2 = 0;

        int a = 100;
        int b = 100;

        while (true) {

            System.out.println("First: " + container1 + "/" + a + "\n" + "Second: " + container2 + "/" + b);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            String command = parts[0];
            int value = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                if (value > 0) {
                    container1 += value;
                }
                if (container1 > 100) {
                    container1 = 100;
                }
            }

            if (command.equals("move")) {
                if (value > 0) {
                    if (value > container1) {
                        value = container1;
                    }
                    container1 -= value;
                    container2 += value;

                    if (container2 > 100) {
                        container2 = 100;
                    }
                }

            }

            if (command.equals("remove")) {
                if (value > 0) {
                    container2 -= value;
                    if (container2 < 0) {
                        container2 = 0;
                    }
                }
            }
        }
    }
}

//temp for git
