
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString() {
        String printOutput = "";
        
        if (elements.size() > 1) {
            printOutput = "The collection " + this.name + " has " + elements.size() + " elements:";
        } else {
            printOutput = "The collection " + this.name + " has " + elements.size() + " element:";
        }
        
        if (elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        }
        
        String elementsInCollection = "";
        
        for (String element: elements) {
            if (elements.size() == 1) {
                elementsInCollection += element;
            } else if (elements.size() > 1) {
                elementsInCollection += element + "\n";
            }   
        }
  
        return printOutput + "\n" + elementsInCollection;
    }
    
    
}
