package Assignment8;

import Assignment8.Snacks.*;
import Assignment8.VendingMachineState.*;

import java.util.HashMap;
import java.util.Map;

public class VendingMachine implements VendingMachineService{
    private StateOfVendingMachine state= new IdleState();
    private Map<String,Snack> snackMap;
    private Snack choice;
    private double money;
    public VendingMachine(){
        this.money=0;
        this.choice=null;

        snackMap=new HashMap<>();
        snackMap.put("cheetos",new Cheetos(1,10));
        snackMap.put("coke",new Coke(2,9));
        snackMap.put("doritos",new Doritos(1,10));
        snackMap.put("kitkat",new KitKat(3,3));
        snackMap.put("pepsi",new Pepsi(2,11));
        snackMap.put("snickers",new Snickers(3,1));

    }

    public StateOfVendingMachine getState(){
        return state;
    }
    public void setState(StateOfVendingMachine state){
        this.state=state;
    }
    public void setChoice(String snack){
        if(snackMap.containsKey(snack)) {
            this.choice = snackMap.get(snack);
        }
        else {
            choice=null;
        }
    }
    public Snack getChoice(){
        return choice;
    }
    public void resetMoney(){
        this.money=0;
    }
    public void addMoney(double money){
        this.money+=money;
    }
    public double getMoney(){
        return money;
    }
    public void selectSnack(String snack){
        getState().idle(this,snack);
    }
    public double insertMoney(double money){
        return getState().waitingForMoney(this,money);
    }
    public double dispensingSnack(){
        return getState().dispensingSnack(this);
    }


}
