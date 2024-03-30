package Assignment5;

import Assignment5.Customer.*;
import Assignment5.MenuItem.HotDog.*;
import Assignment5.MenuItem.Drink.*;
import Assignment5.MenuItem.Burger.*;

import Assignment5.MenuItem.HotDogToppings.*;
import Assignment5.MenuItem.BurgerToppings.*;
import Assignment5.MenuItem.DrinkAddOn.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerTest {
    Customer zhong = new Customer("Zhong", new Loyalty(0.1));

    @Test
    public void customerOrderPriceTest(){
        double expectedPrice = 67.85;
        zhong.addToOrder(new Sugar(new Ketchup(new Mustard(new Jalapeno(new Beefdog())))));
        zhong.addToOrder(new Ketchup(new Mustard(new Veggiedog())));

        zhong.addToOrder(new Bacon(new Avocado(new Cheese(new Mushroom(new BeefPatty())))));
        zhong.addToOrder(new Avocado(new Mushroom(new VeggiePatty())));

        zhong.addToOrder(new Boba(new MilkTea()));
        zhong.addToOrder(new Boba(new Coconut(new Jelly(new Strawberry(new ThaiTea())))));
        double output = Double.valueOf(String.format("%.2f",zhong.getOrderCost()));

        assertEquals(expectedPrice,output);
    }
    @Test
    public void customerOrderLoyaltyTest(){
        double expectedPrice = 61.07;
        zhong.addToOrder(new Sugar(new Ketchup(new Mustard(new Jalapeno(new Beefdog())))));
        zhong.addToOrder(new Ketchup(new Mustard(new Veggiedog())));

        zhong.addToOrder(new Bacon(new Avocado(new Cheese(new Mushroom(new BeefPatty())))));
        zhong.addToOrder(new Avocado(new Mushroom(new VeggiePatty())));

        zhong.addToOrder(new Boba(new MilkTea()));
        zhong.addToOrder(new Boba(new Coconut(new Jelly(new Strawberry(new ThaiTea())))));
        double output = Double.valueOf(String.format("%.2f",zhong.applyLoyalty()));

        assertEquals(expectedPrice,output);
    }
}
