package Customer;

public class Loyalty {
    private double discout;
    public Loyalty(double discout){
        this.discout=1-discout;
    }
    public void setDiscout(double discout) {
        this.discout = discout;
    }

    public double getDiscout() {
        return discout;
    }

    public double applyDiscount(double price){
        return price*discout;
    }
}
