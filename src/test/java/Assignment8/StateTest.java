package Assignment8;
import Assignment8.VendingMachineState.DispensingSnackState;
import Assignment8.VendingMachineState.IdleState;
import Assignment8.VendingMachineState.StateOfVendingMachine;
import Assignment8.VendingMachineState.WaitingForMoneyState;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StateTest {

    private VendingMachine vendingMachine = new VendingMachine();

    @Test
    public void selectSnackTest(){
        vendingMachine.selectSnack("Snickers");
        assertTrue(vendingMachine.getState() instanceof WaitingForMoneyState);
    }
    @Test
    public void selectNonexistentSnackTest(){
        vendingMachine.selectSnack("Pizza");
        assertTrue(vendingMachine.getState() instanceof IdleState);
    }
    @Test
    public void selectEmptySnackTest(){
        vendingMachine.selectSnack("Snickers");
        assertTrue(vendingMachine.getState() instanceof WaitingForMoneyState);
    }
    @Test
    public void waitingForMoneyTest(){
        StateOfVendingMachine expected = new DispensingSnackState();
        vendingMachine.selectSnack("Snickers");
        vendingMachine.insertMoney(5);
        vendingMachine.dispensingSnack();
        vendingMachine.selectSnack("Snickers");
        vendingMachine.insertMoney(5);
        vendingMachine.dispensingSnack();

        assertTrue(vendingMachine.getState() instanceof IdleState);
    }
    @Test
    public void waitingForNotEnoughMoneyTest(){
        StateOfVendingMachine expected = new IdleState();
        vendingMachine.selectSnack("Cheetos");
        vendingMachine.insertMoney(0);
        assertTrue(vendingMachine.getState() instanceof IdleState);
    }
    @Test
    public void dispensingSnackTest(){
        StateOfVendingMachine expected = new IdleState();
        vendingMachine.selectSnack("Cheetos");
        vendingMachine.insertMoney(5);
        vendingMachine.dispensingSnack();
        assertTrue(vendingMachine.getState() instanceof IdleState);
    }
}
