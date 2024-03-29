package Assignment5.MenuItem.Burger;

import Assignment5.MenuItem.Interface.MenuItem;

public class VeggiePatty implements Burger {
    @Override
    public String getDescription() {
        return "Veggie Patty Burger with";
    }
    @Override
    public double getCost() {
        return 10;
    }
}
