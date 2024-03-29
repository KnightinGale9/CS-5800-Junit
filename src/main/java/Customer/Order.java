package Customer;

import Food.Base.*;
import Food.Interface.Food;
import Food.Toppings.*;

public class Order {

    public static void main(String[] args) {
        Customer zhong = new Customer("Zhong", new Loyalty(0.3));
        zhong.addToOrder(new Bacon(new Mushroom(new Veggiedog())));
        zhong.addToOrder(new Cheese(new Guacamole(new BeefPatty())));
        zhong.printOrder();
    }
}
