package Assignment8.Snacks;

public abstract class Snack {
    private String name;
    private double price;
    private int quantity;

    public Snack(String name,double price, int quantity){
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void dispense(){
        quantity--;
        System.out.println("Here is your " + this.getName());
    }

    public boolean avalibility(){
        if(quantity>0){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public String toString() {
        return String.format("%s is $%s %s",
                this.name,this.price,
                this.avalibility()?"":"This Snack is no longer available");
    }
}
