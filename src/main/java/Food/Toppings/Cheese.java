package Food.Toppings;

import Food.Interface.Food;

public class Cheese extends FoodToppings {
    public Cheese(Food newFood){
        super(newFood);
    }
    @Override
    public String getDescription() {
        return tempFood.getDescription()+ " Cheese";
    }

    @Override
    public double getCost() {
        return tempFood.getCost()+ 1.50;
    }
}
