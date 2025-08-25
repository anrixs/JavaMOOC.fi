
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.squares) {
            return true;
        } if (this.squares < compared.squares) {
            return false;
        }
        return false;
    }
    
    public int priceDifference(Apartment compared) {
        int calculation = (squares * pricePerSquare) - (compared.squares * compared.pricePerSquare);
        
        if (calculation < 0) {
            return calculation * (-1);
        }
        return calculation;
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        if ((squares * pricePerSquare) > (compared.squares * compared.pricePerSquare)) {
            return true;
        }
        if ((squares * pricePerSquare) > (compared.squares * compared.pricePerSquare)) {
            return false;
        }
        return false;
    }
}
