package Assignment5.MenuItem.BurgerToppings;

import Assignment5.MenuItem.Burger.Burger;
import Assignment5.MenuItem.Interface.MenuItem;

public class Mushroom extends BurgerToppings {
    public Mushroom(Burger menuItem) {
        super(menuItem);
    }

    @Override
    public String getDescription() {
        return tempMenuItem.getDescription()+ " Mushroom";
    }

    @Override
    public double getCost() {
        return tempMenuItem.getCost()+ 1.25;
    }
}