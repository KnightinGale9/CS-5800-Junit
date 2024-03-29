package Assignment5.MenuItem.HotDog;

public class Veggiedog implements Hotdog {

    @Override
    public String getDescription() {
        return "Veggie Hot Dog with";
    }
    @Override
    public double getCost() {
        return 8;
    }
}
