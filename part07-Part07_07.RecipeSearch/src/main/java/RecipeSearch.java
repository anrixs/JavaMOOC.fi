
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File to read: ");
        String file = scanner.nextLine();

        ArrayList<Recipe> recipes = new ArrayList<>();

        try (Scanner reader = new Scanner(Paths.get(file))) {
            while (reader.hasNextLine()) {
                String name = reader.nextLine();
                if (name.isEmpty()) {
                    continue;
                }

                int time = Integer.parseInt(reader.nextLine());

                Recipe recipe = new Recipe(name, time);

                while (reader.hasNextLine()) {
                    String ingredient = reader.nextLine();
                    if (ingredient.isEmpty()) {
                        break;
                    }
                    recipe.addIngredients(ingredient);
                }

                recipes.add(recipe);

            }
        } catch (IOException ex) {
            System.out.println("Error: " + ex);
        }
        System.out.println("");
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");

        System.out.println("");

        while (true) {
            System.out.println("Enter the command: ");
            String input = scanner.nextLine();

            if (input.equals("list")) {
                System.out.println("Recipes: ");
                for (Recipe recipe : recipes) {
                    System.out.println(recipe.getName() + ", cooking time: " + recipe.getTime());
                }
                System.out.println("");
            } else if (input.equals("stop")) {
                break;
            } else if (input.equals("find name")) {
                System.out.println("Searched word: ");
                String searchedWord = scanner.nextLine();

                System.out.println("Recipes: ");
                for (Recipe recipe : recipes) {
                    if (recipe.getName().contains(searchedWord)) {
                        System.out.println(recipe.getName() + ", cooking time: " + recipe.getTime());
                    }
                }
            } else if (input.equals("find cooking time")) {
                System.out.println("Max cooking time: ");
                int cookingTime = Integer.valueOf(scanner.nextLine());

                System.out.println("Recipes: ");
                for (Recipe recipe : recipes) {
                    if (recipe.getTime() <= cookingTime) {
                        System.out.println(recipe.getName() + ", cooking time: " + recipe.getTime());
                    }
                }
            } else if (input.equals("find ingredient")) {
                System.out.println("Ingredient: ");
                String ingredient = scanner.nextLine();

                System.out.println("Recipes: ");
                for (Recipe recipe : recipes) {
                    if (recipe.getIngredients().contains(ingredient)) {
                        System.out.println(recipe.getName() + ", cooking time: " + recipe.getTime());
                    }
                }
            }
        }
    }
}
