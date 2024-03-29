package Assignment5.MenuItem.Drink;

public class MilkTea implements Drink{
    @Override
    public String getDescription() {
        return "Milk Tea with";
    }

    @Override
    public double getCost() {
        return 5.5;
    }
}
