package Assignment5.MenuItem.HotDogToppings;

import Assignment5.MenuItem.HotDog.Hotdog;

public class Ketchup extends HotDogToppings{

    public Ketchup(Hotdog menuItem) {
        super(menuItem);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+ " Ketchup";
    }

    @Override
    public double getCost() {
        return super.getCost()+0.1;
    }
}
