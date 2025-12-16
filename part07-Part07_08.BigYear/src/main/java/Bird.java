
public class Bird {
    private String name;
    private String nameInLatin;
    private int observation;
    
    public Bird (String name, String nameInLatin) {
        this.name = name;
        this.nameInLatin = nameInLatin;
        this.observation = 0;
    }
    
    public String getName() {
        return name;
    }
    
    public String getNameInLatin() {
        return "(" + nameInLatin + ")";
    }
    
    public void addObservation() {
        observation = observation + 1;
    }
    
    public int getObservation() {
        return observation;
    }
}
