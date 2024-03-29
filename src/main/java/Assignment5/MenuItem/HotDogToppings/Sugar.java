package Assignment5.MenuItem.HotDogToppings;

import Assignment5.MenuItem.HotDog.Hotdog;

public class Sugar extends HotDogToppings{

    public Sugar(Hotdog menuItem) {
        super(menuItem);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+ " Sugar";
    }

    @Override
    public double getCost() {
        return super.getCost()+0.3;
    }
}
