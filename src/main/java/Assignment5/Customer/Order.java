package Assignment5.Customer;

import Assignment5.Food.Base.BeefPatty;
import Assignment5.Food.Base.Veggiedog;
import Assignment5.Food.Toppings.Bacon;
import Assignment5.Food.Toppings.Cheese;
import Assignment5.Food.Toppings.Guacamole;
import Assignment5.Food.Toppings.Mushroom;
import Food.Base.*;
import Food.Toppings.*;

public class Order {

    public static void main(String[] args) {
        Customer zhong = new Customer("Zhong", new Loyalty(0.3));
        zhong.addToOrder(new Bacon(new Mushroom(new Veggiedog())));
        zhong.addToOrder(new Cheese(new Guacamole(new BeefPatty())));
        zhong.printOrder();
    }
}
