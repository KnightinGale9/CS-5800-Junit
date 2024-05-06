package Assignment8.ChainOfResponsibility;

import Assignment8.Snacks.Cheetos;
import Assignment8.Snacks.Pepsi;
import Assignment8.Snacks.Snack;

public class PepsiDispenser extends SnackDispenseHandler{
    public PepsiDispenser(SnackDispenseHandler next) {
        super(next);
    }
    @Override
    public void handleRequest(Snack requestType) {
        if(requestType instanceof Pepsi){
            if(requestType.avalibility()) {
                requestType.dispense();
            }
        }
        else{
            super.handleRequest(requestType);
        }
    }
}
