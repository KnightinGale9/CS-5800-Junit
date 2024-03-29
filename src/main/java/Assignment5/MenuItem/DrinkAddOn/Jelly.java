package Assignment5.MenuItem.DrinkAddOn;

import Assignment5.MenuItem.Drink.Drink;

public class Jelly extends DrinkAddOn{
    public Jelly(Drink menuItem) {
        super(menuItem);
    }

    @Override
    public String getDescription() {
        return tempMenuItem.getDescription()+ " Jelly";
    }

    @Override
    public double getCost() {
        return tempMenuItem.getCost()+ 2;
    }
}
