package Food.Toppings;

import Food.Interface.Food;

public class Bacon extends FoodToppings {
    public Bacon(Food newFood){
        super(newFood);
    }
    @Override
    public String getDescription() {
        return tempFood.getDescription()+ " Bacon";
    }

    @Override
    public double getCost() {
        return tempFood.getCost()+ 1.75;
    }
}
