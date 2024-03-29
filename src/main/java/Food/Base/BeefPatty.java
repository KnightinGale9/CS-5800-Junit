package Food.Base;

import Food.Interface.Food;
import Food.Toppings.FoodToppings;

import java.util.ArrayList;

public class BeefPatty implements Food {
    @Override
    public String getDescription() {
        return "Beef Patty Burger with";
    }

    @Override
    public double getCost() {
        return 9;
    }
}
