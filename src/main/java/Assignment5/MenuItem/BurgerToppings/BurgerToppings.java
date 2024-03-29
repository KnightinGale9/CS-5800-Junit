package Assignment5.MenuItem.BurgerToppings;

import Assignment5.MenuItem.Burger.Burger;

public abstract class BurgerToppings implements Burger {
    protected Burger tempMenuItem;
    public BurgerToppings(Burger menuItem){
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
