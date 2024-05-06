package Assignment8;

public class vendingMachineDriver {
    public static void main(String[] args) {
        VendingMachineService vendingMachine=new VendingMachineProxy();
        String[] snackSelector = new String[]{"Cheetos","Coke","Doritos","Kitkat","Pepsi","Snickers","Snickers","Snickers","Snickers","Snickers"};
        for(String snack: snackSelector ){
            vendingMachine.selectSnack(snack);
            vendingMachine.insertMoney(5);
            vendingMachine.dispensingSnack();
        }
    }

}
