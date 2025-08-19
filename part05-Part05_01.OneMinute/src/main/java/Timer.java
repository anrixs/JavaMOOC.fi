public class Timer {

    private ClockHand seconds;
    private ClockHand hundrethsOfASeconds;
    
    public Timer () {
        this.seconds = new ClockHand(60);
        this.hundrethsOfASeconds = new ClockHand(100);
    }
    
    public void advance() {
        this.hundrethsOfASeconds.advance();
        
        if (this.hundrethsOfASeconds.value() == 0) {
            this.seconds.advance();
            
        }
    }
    
    public String toString() {
        return this.seconds + ":" + this.hundrethsOfASeconds;
    }
}
