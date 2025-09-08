
import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Item> items = new ArrayList<>();
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }

    public void addItem(Item items) {
        int totalWeight = 0;
        for (Item item : this.items) {
            totalWeight += item.getWeight();
        }
        if ((items.getWeight() + totalWeight) <= maxWeight) {
            this.items.add(items);
        }
    }

    public void printItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public int totalWeight() {
        int totalWeight = 0;

        for (Item item : items) {
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }

    public Item heaviestItem() {
        if (items.isEmpty()) {
            return null;
        }

        Item heaviest = this.items.get(0);

        for (Item item : items) {
            if (heaviest.getWeight() < item.getWeight()) {
                heaviest = item;
            }
        }
        return heaviest;
    }

    public String toString() {
        String output = "";

        if (items.isEmpty()) {
            return "no items (0 kg)";
        }

        if (items.size() == 1) {
            output = this.items.size() + " item (";
        } else {
            output = this.items.size() + " items (";
        }

        int sumOfWeights = 0;

        for (Item item : items) {
            sumOfWeights += item.getWeight();
        }
        return output + sumOfWeights + "kg)";
    }
}
