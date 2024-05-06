package Assignment8.VendingMachineState;

import Assignment8.VendingMachine;

public class IdleState implements StateOfVendingMachine{
    @Override
    public void idle(VendingMachine vendingMachine,String snack) {
        vendingMachine.setState(new WaitingForMoneyState());
        vendingMachine.setChoice(snack.toLowerCase().strip());
        System.out.println(vendingMachine.getChoice());
        if(vendingMachine.getChoice() == null || !vendingMachine.getChoice().avalibility()){
            vendingMachine.setState(new IdleState());
        }
    }

    @Override
    public double waitingForMoney(VendingMachine vendingMachine, double money) {
        return 0;
    }

    @Override
    public double dispensingSnack(VendingMachine vendingMachine) {
    //do nothing
        return 0;
    }
}
