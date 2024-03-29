package Assignment5.MenuItem.HotDogToppings;


import Assignment5.MenuItem.HotDog.Hotdog;

public abstract class HotDogToppings implements Hotdog {
    protected Hotdog tempMenuItem;
    public HotDogToppings(Hotdog menuItem){
        this.tempMenuItem = menuItem;
    }
    @Override
    public String getDescription() {
        return tempMenuItem.getDescription();
    }
    @Override
    public double getCost() {
        return tempMenuItem.getCost();
    }
}
