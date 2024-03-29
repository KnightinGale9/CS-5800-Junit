package Assignment5.Food.Base;

import Assignment5.Food.Interface.Food;

public class VeggiePatty implements Food {
    @Override
    public String getDescription() {
        return "Veggie Patty Burger with";
    }
    @Override
    public double getCost() {
        return 10;
    }
}
