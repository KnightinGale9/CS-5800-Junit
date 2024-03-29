package Food.Base;

import Food.Interface.Food;

public class Hotdog implements Food{
    @Override
    public String getDescription() {
        return "HotDog with";
    }

    @Override
    public double getCost() {
        return 7;
    }
}
