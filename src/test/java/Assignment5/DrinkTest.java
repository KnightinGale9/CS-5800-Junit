package Assignment5;

import Assignment5.MenuItem.Drink.*;
import Assignment5.MenuItem.DrinkAddOn.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DrinkTest {

    @Test
    public void MilkTeaPriceTest(){
        double expectedPrice = 8.00;
        Drink drink = new Boba(new MilkTea());
        double output = Double.valueOf(String.format("%.2f",drink.getCost()));
        assertEquals(expectedPrice,output);

    }
    @Test
    public void MilkTeaDescriptionTest(){
        String expectedDescription = "Milk Tea with Boba";
        Drink drink = new Boba(new MilkTea());
        assertEquals(expectedDescription,drink.getDescription());

    }
    @Test
    public void ThaiTeaPriceTest(){
        double expectedPrice = 14.50;
        Drink drink = new Boba(new Coconut(new Jelly(new Strawberry(new ThaiTea()))));
        double output = Double.valueOf(String.format("%.2f",drink.getCost()));
        assertEquals(expectedPrice,output);

    }
    @Test
    public void ThaiTeaDescriptionTest(){
        String expectedDescription = "Thai Tea with Strawberry Jelly Coconut Boba";
        Drink drink = new Boba(new Coconut(new Jelly(new Strawberry(new ThaiTea()))));
        assertEquals(expectedDescription,drink.getDescription());

    }
}
