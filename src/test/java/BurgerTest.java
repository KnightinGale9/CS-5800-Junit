import Assignment5.MenuItem.Burger.*;
import Assignment5.MenuItem.BurgerToppings.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BurgerTest {

    @Test
    public void BeefPattyPriceTest(){
        double expectedPrice = 15.75;
        Burger burger = new Bacon(new Avocado(new Cheese(new Mushroom(new BeefPatty()))));
        double output = Double.valueOf(String.format("%.2f",burger.getCost()));
        assertEquals(expectedPrice,output);

    }
    @Test
    public void BeefPattyDescriptionTest(){
        String expectedDescription = "Beef Patty Burger with Mushroom Cheese Avocado Bacon";
        Burger burger = new Bacon(new Avocado(new Cheese(new Mushroom(new BeefPatty()))));
        assertEquals(expectedDescription,burger.getDescription());

    }
    @Test
    public void VeggiePattyPriceTest(){
        double expectedPrice = 13.50;
        Burger burger = new Avocado(new Mushroom(new VeggiePatty()));
        double output = Double.valueOf(String.format("%.2f",burger.getCost()));
        assertEquals(expectedPrice,output);

    }
    @Test
    public void VeggiePattyDescriptionTest(){
        String expectedDescription = "Veggie Patty Burger with Mushroom Avocado";
        Burger burger = new Avocado(new Mushroom(new VeggiePatty()));
        assertEquals(expectedDescription,burger.getDescription());

    }
}
