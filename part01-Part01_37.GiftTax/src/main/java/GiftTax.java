
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Value of the gift?");
        int gift = Integer.valueOf(scan.nextLine());
        
        if (gift < 5000) {
            System.out.println("No tax!");
        }
        
        double tax = 1.0 * (100 + (gift - 5000) * 0.08);
        double tax1 = 1.0 * (1700 + (gift - 25000) * 0.10);
        double tax2 = 1.0 * (4700 + (gift - 55000) * 0.12);
        double tax3 = 1.0 * (22100 + (gift - 200000) * 0.15);
        double tax4 = 1.0 * (142100 + (gift - 1000000) * 0.17);
        
        
        if (gift >= 5000 && gift <= 25000) {
            System.out.println("Tax: " + tax);
        }
        if (gift >= 25000 && gift <= 55000) {
            System.out.println("Tax: " + tax1);
        }
        if (gift >= 55000 && gift <= 200000) {
            System.out.println("Tax: " + tax2);
        }
        if (gift >= 200000 && gift <= 1000000) {
            System.out.println("Tax: " + tax3);
        }
        if (gift >= 100000) {
            System.out.println("Tax: " + tax4);
        }

    }
}
