package Assignment8.VendingMachineState;

import Assignment8.ChainOfResponsibility.*;
import Assignment8.VendingMachine;

public class DispensingSnackState implements StateOfVendingMachine{
    @Override
    public void idle(VendingMachine vendingMachine,String snack) {

    }
    @Override
    public double waitingForMoney(VendingMachine vendingMachine,double money) {
    //do nothing
        return 0;
    }

    @Override
    public double dispensingSnack(VendingMachine vendingMachine) {
        vendingMachine.setState(new IdleState());
        SnackDispenseHandler snackDispenseHandler = new CokeDispenser(new PepsiDispenser(new CheetosDispenser(new DoritosDispenser(new KitKatDispenser(new SnickersDispenser(null))))));
        snackDispenseHandler.handleRequest(vendingMachine.getChoice());
        double change = vendingMachine.getMoney()-vendingMachine.getChoice().getPrice();
        System.out.println("Here is your change " + change);
        vendingMachine.resetMoney();
        return change;
    }
}
