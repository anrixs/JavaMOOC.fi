
import java.util.ArrayList;


public class Recipe {
    private String name;
    private int time;
    private ArrayList<String> ingredients;
    
    public Recipe(String name, int time) {
        this.name = name;
        this.time = time;
        this.ingredients = new ArrayList<>();
    }
    
    public String getName() {
        return name;
    }
    
    public int getTime() {
        return time;
    }
    
    public void addIngredients(String ingredients) {
        this.ingredients.add(ingredients);
    }
        
    public ArrayList<String> getIngredients() {
        return ingredients;
    }
    
    public String toString () {
        return name + ", cooking time: " + time;
    }
}
