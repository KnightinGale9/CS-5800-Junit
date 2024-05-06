package Assignment8;

public class VendingMachineProxy implements VendingMachineService{
    private VendingMachine vendingMachine;
    public VendingMachineProxy() {
        vendingMachine = new VendingMachine();
    }

    public void selectSnack(String snack){
        vendingMachine.selectSnack(snack);
    }
    public double insertMoney(double money){
        return vendingMachine.insertMoney(money);
    }
    public double dispensingSnack(){
        return vendingMachine.dispensingSnack();
    }
}
