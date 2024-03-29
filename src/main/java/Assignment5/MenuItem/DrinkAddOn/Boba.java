package Assignment5.MenuItem.DrinkAddOn;

import Assignment5.MenuItem.Drink.Drink;

public class Boba extends DrinkAddOn{
    public Boba(Drink menuItem) {
            super(menuItem);
        }

    @Override
    public String getDescription() {
        return tempMenuItem.getDescription()+ " Boba";
    }

    @Override
    public double getCost() {
        return tempMenuItem.getCost()+ 2.50;
    }
}
