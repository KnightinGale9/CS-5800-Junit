package Assignment5.MenuItem.Burger;

import Assignment5.MenuItem.Interface.MenuItem;

import java.util.ArrayList;

public class BeefPatty implements Burger {
    @Override
    public String getDescription() {
        return "Beef Patty Burger with";
    }
    @Override
    public double getCost() {
        return 9;
    }
}
