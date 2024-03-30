package Assignment5.Customer;

import Assignment5.MenuItem.Burger.*;
import Assignment5.MenuItem.BurgerToppings.*;
import Assignment5.MenuItem.Drink.*;
import Assignment5.MenuItem.DrinkAddOn.*;
import Assignment5.MenuItem.HotDog.*;
import Assignment5.MenuItem.HotDogToppings.*;

public class Order {

    public static void main(String[] args) {
        Customer zhong = new Customer("Zhong", new Loyalty(0.1));

        zhong.addToOrder(new Sugar(new Ketchup(new Mustard(new Jalapeno(new Beefdog())))));
        zhong.addToOrder(new Ketchup(new Mustard(new Veggiedog())));

        zhong.addToOrder(new Bacon(new Avocado(new Cheese(new Mushroom(new BeefPatty())))));
        zhong.addToOrder(new Avocado(new Mushroom(new VeggiePatty())));

        zhong.addToOrder(new Boba(new MilkTea()));
        zhong.addToOrder(new Boba(new Coconut(new Jelly(new Strawberry(new ThaiTea())))));

        zhong.printOrder();
    }
}
