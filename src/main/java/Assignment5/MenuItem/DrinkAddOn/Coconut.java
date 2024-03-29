package Assignment5.MenuItem.DrinkAddOn;

import Assignment5.MenuItem.Drink.Drink;

public class Coconut extends DrinkAddOn {
    public Coconut(Drink menuItem) {
        super(menuItem);
    }

    @Override
    public String getDescription() {
        return tempMenuItem.getDescription() + " Coconut";
    }

    @Override
    public double getCost() {
        return tempMenuItem.getCost() + 1.50;
    }
}