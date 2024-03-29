package Assignment5.MenuItem.HotDogToppings;

import Assignment5.MenuItem.HotDog.Hotdog;

public class Jalapeno extends HotDogToppings{

    public Jalapeno(Hotdog menuItem) {
        super(menuItem);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+ " Jalapeno";
    }

    @Override
    public double getCost() {
        return super.getCost()+0.4;
    }
}
