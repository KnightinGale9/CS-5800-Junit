package Assignment5.MenuItem.HotDog;

import Assignment5.MenuItem.Interface.MenuItem;

public class Beefdog implements Hotdog {
    @Override
    public String getDescription() {
        return "Beef Hot Dog with";
    }
    @Override
    public double getCost() {
        return 7;
    }
}
