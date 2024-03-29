import Assignment5.MenuItem.HotDog.*;
import Assignment5.MenuItem.HotDogToppings.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class HotDogTest {

    @Test
    public void BeefdogPriceTest(){
        double expectedPrice = 7.90;
        Hotdog hotdog = new Sugar(new Ketchup(new Mustard(new Jalapeno(new Beefdog()))));
        double output = Double.valueOf(String.format("%.2f",hotdog.getCost()));
        assertEquals(expectedPrice,output);

    }
    @Test
    public void BeefdogDescriptionTest(){
        String expectedDescription = "Beef Hot Dog with Jalapeno Mustard Ketchup Sugar";
        Hotdog hotdog = new Sugar(new Ketchup(new Mustard(new Jalapeno(new Beefdog()))));
        assertEquals(expectedDescription,hotdog.getDescription());

    }
    @Test
    public void VeggiedogPriceTest(){
        double expectedPrice = 8.20;
        Hotdog hotdog = new Ketchup(new Mustard(new Veggiedog()));
        double output = Double.valueOf(String.format("%.2f",hotdog.getCost()));
        assertEquals(expectedPrice,output);

    }
    @Test
    public void VeggiedogDescriptionTest(){
        String expectedDescription = "Veggie Hot Dog with Mustard Ketchup";
        Hotdog hotdog = new Ketchup(new Mustard(new Veggiedog()));
        assertEquals(expectedDescription,hotdog.getDescription());

    }
}
