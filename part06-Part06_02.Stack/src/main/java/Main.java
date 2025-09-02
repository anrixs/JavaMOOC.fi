
public class Main {

    public static void main(String[] args) {

        Stack a = new Stack();
        System.out.println(a.isEmpty());
        System.out.println(a.values());
        a.add("Value");
        System.out.println(a.isEmpty());
        System.out.println(a.values());
        String taken = a.take();
        System.out.println(a.isEmpty());
        System.out.println(a.values());
        System.out.println(taken);
        
        System.out.println();

        Stack s = new Stack();
        s.add("1");
        s.add("2");
        s.add("3");
        s.add("4");
        s.add("5");

        while (!s.isEmpty()) {
            System.out.println(s.take());
        }

    }
}
