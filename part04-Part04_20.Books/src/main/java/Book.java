
public class Book {
    private String title;
    private int pages;
    private int year;
    
    public Book (String initialName, int initialPages, int initialYear){
        this.title = initialName;
        this.pages = initialPages;
        this.year = initialYear;
    }
    
    public String getName() {
        return this.title;
    }
    
    public int getPages() {
        return this.pages;
    }
    
    public int getYear() {
        return this.year;
    }
    
    public String toString() {
        return this.title + ", " + this.pages + " pages, " + this.year;
    }
    
}
