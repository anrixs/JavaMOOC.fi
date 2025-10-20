
import java.util.ArrayList;

public class JokeManager {

    private ArrayList<String> jokes = new ArrayList<>();

    public JokeManager() {
        this.jokes = new ArrayList<>(); 
    }

    public void addJoke(String joke) {
        this.jokes.add(joke);
    }

    public String drawJoke() {
        if (jokes.isEmpty()) {
            return "Jokes are in short supply.";
        }
        int index = (int) (Math.random() * this.jokes.size());
        return jokes.get(index);
    }

    public void printJokes() {
        System.out.println(jokes);
    }

}
