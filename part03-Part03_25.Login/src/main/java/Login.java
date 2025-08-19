
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String username1 = "alex";
        String password1 = "sunshine";
        
        String username2 = "emma";
        String password2 = "haskell";
        
        System.out.println("Enter username: ");
        String userNameInput = scanner.nextLine();
        
        System.out.println("Enter password: ");
        String userPasswordInput = scanner.nextLine();
        
        if (userNameInput.equals(username1) && userPasswordInput.equals(password1)) {
            System.out.println("You have successfully logged in!");
        } else if (userNameInput.equals(username2) && userPasswordInput.equals(password2)) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }

    }
}
