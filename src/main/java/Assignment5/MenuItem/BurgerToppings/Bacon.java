package Assignment5.MenuItem.BurgerToppings;

import Assignment5.MenuItem.Burger.Burger;

public class Bacon extends BurgerToppings {
    public Bacon(Burger newMenuItem){
        super(newMenuItem);
    }
    @Override
    public String getDescription() {
        return tempMenuItem.getDescription()+ " Bacon";
    }
    @Override
    public double getCost() {
        return tempMenuItem.getCost()+ 1.75;
    }
}
