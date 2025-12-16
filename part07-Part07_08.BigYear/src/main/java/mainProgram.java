
import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayList<Bird> birds = new ArrayList<>();

        while (true) {
            System.out.println("?");
            String command = scan.nextLine();

            if (command.equals("Quit")) {
                break;
            } else if (command.equals("Add")) {
                System.out.println("Name: ");
                String name = scan.nextLine();
                System.out.println("Name in Latin: ");
                String nameInLatin = scan.nextLine();

                birds.add(new Bird(name, nameInLatin));
            } else if (command.equals("All")) {
                for (Bird bird : birds) {
                    System.out.println(bird.getName() + " " + bird.getNameInLatin() + ": " + bird.getObservation() + " observations");
                }
            } else if (command.equals("One")) {
                System.out.println("Bird? ");
                String oneBird = scan.nextLine();
                boolean found = false;
                for (Bird bird : birds) {
                    if (bird.getName().equals(oneBird)) {
                        System.out.println(bird.getName() + " " + bird.getNameInLatin() + ": " + bird.getObservation() + " observations");
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Not a bird");
                }
            } else if (command.equals(("Observation"))) {
                System.out.println("Bird? ");
                String whichBird = scan.nextLine();
                boolean found = false;

                for (Bird bird : birds) {
                    if (bird.getName().equals(whichBird)) {
                        found = true;
                        bird.addObservation();
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Not a bird!");
                }
            }

        }
    }

}
