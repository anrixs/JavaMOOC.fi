
import java.util.ArrayList;

public class Hold {

    private ArrayList<Suitcase> suitcases = new ArrayList<>();
    private int maximumWeight;

    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        int currentTotalWeight = 0;
        for (Suitcase scase : this.suitcases) {
            currentTotalWeight += scase.totalWeight();
        }
        if ((suitcase.totalWeight() + currentTotalWeight) <= maximumWeight) {
            this.suitcases.add(suitcase);
        }
    }

    public void printItems() {
        for (Suitcase suitcase : suitcases) {
            suitcase.printItems();
        }
    }

    public String toString() {
        String output = "";

        if (suitcases.size() == 1) {
            output = this.suitcases.size() + " suitcase (";
        } else {
            output = this.suitcases.size() + " suitcases (";
        }

        int sumOfWeights = 0;

        for (Suitcase suitcase : suitcases) {
            sumOfWeights += suitcase.totalWeight();
        }
        return output + sumOfWeights + "kg)";
    }

}
