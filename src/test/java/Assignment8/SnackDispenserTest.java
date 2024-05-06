package Assignment8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SnackDispenserTest {
    private VendingMachine vendingMachine = new VendingMachine();
    @Test
    public void CheetosDispenserTest(){
        double expectedQuanity = 9;
        vendingMachine.selectSnack("Cheetos");
        vendingMachine.insertMoney(5);
        vendingMachine.dispensingSnack();
        assertEquals(expectedQuanity,vendingMachine.getChoice().getQuantity());
    }
    @Test
    public void CokeDispenserTest(){
        double expectedQuanity = 8;
        vendingMachine.selectSnack("Coke");
        vendingMachine.insertMoney(5);
        vendingMachine.dispensingSnack();
        assertEquals(expectedQuanity,vendingMachine.getChoice().getQuantity());
    }
    @Test
    public void DoritosDispenserTest(){
        double expectedQuanity = 9;
        vendingMachine.selectSnack("Doritos");
        vendingMachine.insertMoney(5);
        vendingMachine.dispensingSnack();
        assertEquals(expectedQuanity,vendingMachine.getChoice().getQuantity());
    }
    @Test
    public void KitKatDispenserTest(){
        double expectedQuanity = 2;
        vendingMachine.selectSnack("KitKat");
        vendingMachine.insertMoney(5);
        vendingMachine.dispensingSnack();
        assertEquals(expectedQuanity,vendingMachine.getChoice().getQuantity());
    }
    @Test
    public void PepsiDispenserTest(){
        double expectedQuanity = 10;
        vendingMachine.selectSnack("Pepsi");
        vendingMachine.insertMoney(5);
        vendingMachine.dispensingSnack();
        assertEquals(expectedQuanity,vendingMachine.getChoice().getQuantity());
    }
    @Test
    public void SnickersDispenserTest(){
        double expectedQuanity = 0;
        vendingMachine.selectSnack("Snickers");
        vendingMachine.insertMoney(5);
        vendingMachine.dispensingSnack();
        assertEquals(expectedQuanity,vendingMachine.getChoice().getQuantity());
    }
}
