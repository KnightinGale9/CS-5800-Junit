package Assignment8.ChainOfResponsibility;

import Assignment8.Snacks.Cheetos;
import Assignment8.Snacks.Snack;

public class CheetosDispenser extends SnackDispenseHandler{
    public CheetosDispenser(SnackDispenseHandler next) {
        super(next);
    }
    @Override
    public void handleRequest(Snack requestType) {
        if(requestType instanceof Cheetos){
            if(requestType.avalibility()) {
                requestType.dispense();
            }
        }
        else{
            super.handleRequest(requestType);
        }
    }
}
