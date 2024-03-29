package Assignment5.MenuItem.BurgerToppings;


import Assignment5.MenuItem.Burger.Burger;

public class Cheese extends BurgerToppings {
    public Cheese(Burger newMenuItem){
        super(newMenuItem);
    }
    @Override
    public String getDescription() {
        return tempMenuItem.getDescription()+ " Cheese";
    }
    @Override
    public double getCost() {
        return tempMenuItem.getCost()+ 1.50;
    }
}
