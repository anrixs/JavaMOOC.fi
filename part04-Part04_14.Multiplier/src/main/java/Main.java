
public class Main {

    public static void main(String[] args) {
        // Test your Multiplier class here

        Multiplier multiplyByThree = new Multiplier(3); //changes the this.value to 3

        System.out.println("multiplyByThree.multiply(2): " + multiplyByThree.multiply(2)); //multiplies this.value=3 * 2 = int number

        Multiplier multiplyByFour = new Multiplier(4);

        System.out.println("multiplyByFour.multiply(2): " + multiplyByFour.multiply(2));
        System.out.println("multiplyByThree.multiply(1): " + multiplyByThree.multiply(1));
        System.out.println("multiplyByFour.multiply(1): " + multiplyByFour.multiply(1));
    }
}
