
import java.util.ArrayList;

public class TodoList {

    private ArrayList<String> list = new ArrayList<>();

    public TodoList() {
        this.list = new ArrayList<>();
    }

    public void add(String task) {
        this.list.add(task);
    }

    public void print() {
        int listNumber = 0;
        for (String toDo : list) {
            listNumber++;
            System.out.println(listNumber + ": " + toDo);
        }
    }

    public void remove(int number) {
        if (number < 1 || number > list.size()) {
            System.out.println("Invalid number");
        } else {
            this.list.remove(number - 1);
        }
    }
}
