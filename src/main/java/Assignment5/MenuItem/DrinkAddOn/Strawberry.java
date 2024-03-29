package Assignment5.MenuItem.DrinkAddOn;

import Assignment5.MenuItem.Drink.Drink;

public class Strawberry extends DrinkAddOn {
    public Strawberry(Drink menuItem) {
        super(menuItem);
    }

    @Override
    public String getDescription() {
        return tempMenuItem.getDescription()+ " Strawberry";
    }

    @Override
    public double getCost() {
        return tempMenuItem.getCost()+ 3;
    }
}
