
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        Counter c = new Counter(2);
        c.decrease(); //calling the decrease() method
        c.decrease();
        c.decrease();
        c.decrease(3); //calling the decrease(int decreaseBy) method
        System.out.println(c.value());
    }
}
