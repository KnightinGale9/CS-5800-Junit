package Food.Toppings;

import Food.Interface.Food;

public class Mushroom extends FoodToppings {
    public Mushroom(Food newFood){
        super(newFood);
    }
    @Override
    public String getDescription() {
        return tempFood.getDescription()+ " Mushroom";
    }

    @Override
    public double getCost() {
        return tempFood.getCost()+ 1.25;
    }
}