package Assignment5.Food.Base;

import Assignment5.Food.Interface.Food;

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
