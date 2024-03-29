package Assignment5.MenuItem.HotDogToppings;

import Assignment5.MenuItem.HotDog.Hotdog;

public class Mustard extends HotDogToppings {

    public Mustard(Hotdog menuItem) {
        super(menuItem);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Mustard";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.1;
    }
}
