
public class PaymentTerminal {
    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals
    private static final double AFFORDABLE_PRICE = 2.50; 
    private static final double HEARTILY_PRICE = 4.30;
    


    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000.0;
    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        
        if (payment >= AFFORDABLE_PRICE) { 
            payment -= AFFORDABLE_PRICE;
            this.money += AFFORDABLE_PRICE;
            this.affordableMeals++;
        }
            return payment;
        }
        

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        if (payment >= HEARTILY_PRICE) {
            payment -= HEARTILY_PRICE;
            this.money += HEARTILY_PRICE;
            this.heartyMeals++;
        }
        return payment;
    }
    
    public boolean eatAffordably(PaymentCard card) {
        if (card.balance() >= AFFORDABLE_PRICE) {
            card.takeMoney(AFFORDABLE_PRICE);
            this.affordableMeals++;
            return true;
        }
        return false;
    }
    
    
    public boolean eatHeartily (PaymentCard card) {
        if (card.balance() >= HEARTILY_PRICE) {
            card.takeMoney(HEARTILY_PRICE);
            this.heartyMeals++;
            return true;
        }
        return false;
    }
    
    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum > 0) {
            card.addMoney(sum);
            this.money += sum;
        }
    }
    
    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
