
import java.util.ArrayList;

public class Room {

    private ArrayList<Person> persons = new ArrayList<>();

    public Room() {
        this.persons = new ArrayList<>();
    }

    public void add(Person person) {
        this.persons.add(person);
    }

    public boolean isEmpty() {
        if (persons.isEmpty()) {
            return true;
        }
        return false;
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public Person shortest() {
        if (persons.isEmpty()) {
            return null;
        }

        Person shortest = this.persons.get(0);

        for (Person person : persons) {
            if (shortest.getHeight() > person.getHeight()) {
                shortest = person;
            }
        }
        return shortest;
    }

    public Person take() {

        if (persons.isEmpty()) {
            return null;
        }

        Person shortest = this.persons.get(0);

        for (Person person : persons) {
            if (shortest.getHeight() > person.getHeight()) {
                shortest = person;
            }
        }
        persons.remove(shortest);
        return shortest;
    }
}
