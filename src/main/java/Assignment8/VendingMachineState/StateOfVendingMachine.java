package Assignment8.VendingMachineState;

import Assignment8.Snacks.Snack;
import Assignment8.VendingMachine;

public interface StateOfVendingMachine {
     public void idle(VendingMachine vendingMachine,String snack);
     public double waitingForMoney(VendingMachine vendingMachine,double money);
     public double dispensingSnack(VendingMachine vendingMachine);
}
