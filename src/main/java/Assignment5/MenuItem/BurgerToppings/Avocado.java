package Assignment5.MenuItem.BurgerToppings;


import Assignment5.MenuItem.Burger.Burger;

public class Avocado extends BurgerToppings {

    public Avocado(Burger menuItem) {
        super(menuItem);
    }
    @Override
    public String getDescription() {
        return tempMenuItem.getDescription()+ " Avocado";
    }
    @Override
    public double getCost() {
        return tempMenuItem.getCost()+ 2.25;
    }
}
