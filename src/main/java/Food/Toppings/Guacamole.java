package Food.Toppings;

import Food.Interface.Food;

public class Guacamole extends FoodToppings {
    public Guacamole(Food newFood){
        super(newFood);
    }
    @Override
    public String getDescription() {
        return tempFood.getDescription()+ " Guacamole";
    }

    @Override
    public double getCost() {
        return tempFood.getCost()+ 2.25;
    }
}
