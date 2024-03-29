package Assignment5.MenuItem.DrinkAddOn;

import Assignment5.MenuItem.Drink.Drink;

public abstract class DrinkAddOn implements Drink {
    protected Drink tempMenuItem;
    public DrinkAddOn(Drink menuItem){
        this.tempMenuItem = menuItem;
    }
    @Override
    public String getDescription() {
        return tempMenuItem.getDescription();
    }
    @Override
    public double getCost() {
        return tempMenuItem.getCost();
    }
}
