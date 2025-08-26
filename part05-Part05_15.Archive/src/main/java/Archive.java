
public class Archive {

    private String name;
    private String identifier;

    public Archive(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Archive)) {
            return false;
        }

        Archive comparedArchive = (Archive) compared;

        return this.identifier.equals(comparedArchive.identifier);
    }

    public String toString() {
        return this.identifier + ": " + this.name;
    }
}
