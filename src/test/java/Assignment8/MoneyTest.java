package Assignment8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoneyTest {

    private VendingMachine vendingMachine = new VendingMachine();
    @Test
    public void CorrectChangeTest() {
        double expectedChange = 2.5;
        vendingMachine.selectSnack("Cheetos");
        vendingMachine.insertMoney(3.5);
        assertEquals(expectedChange,vendingMachine.dispensingSnack());
    }
    @Test
    public void NotEnoughMoney() {
        double expectedChange = 1;
        vendingMachine.selectSnack("Snickers");
        assertEquals(expectedChange, vendingMachine.insertMoney(1));
    }

}
