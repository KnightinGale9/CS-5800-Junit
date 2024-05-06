package Assignment8.VendingMachineState;

import Assignment8.Snacks.Snack;
import Assignment8.VendingMachine;

import java.util.Scanner;

public class WaitingForMoneyState implements StateOfVendingMachine{
    @Override
    public void idle(VendingMachine vendingMachine,String snack) {
    // do nothing
    }

    @Override
    public double waitingForMoney(VendingMachine vendingMachine,double money) {
        vendingMachine.addMoney(money);
        if (vendingMachine.getMoney() >= vendingMachine.getChoice().getPrice()) {
                vendingMachine.setState(new DispensingSnackState());
                return 0;
        }
        else{
            double change = vendingMachine.getMoney();
            System.out.println("Money insufficient. Here is your " + change + " back.");
            vendingMachine.resetMoney();
            vendingMachine.setState(new IdleState());
            return change;
        }
    }

    @Override
    public double dispensingSnack(VendingMachine vendingMachine) {
    // do nothing
        return 0;
    }
}
