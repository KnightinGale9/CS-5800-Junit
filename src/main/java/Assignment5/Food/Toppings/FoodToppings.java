package Assignment5.Food.Toppings;

import Assignment5.Food.Interface.Food;

public abstract class FoodToppings implements Food {
    protected Food tempFood;
    public FoodToppings(Food food){
        this.tempFood = food;
    }

    @Override
    public String getDescription() {
        return tempFood.getDescription();
    }

    @Override
    public double getCost() {
        return tempFood.getCost();
    }
}
