package Assignment8.ChainOfResponsibility;

import Assignment8.Snacks.Snack;
import Assignment8.Snacks.Snickers;

public class SnickersDispenser extends SnackDispenseHandler{
    public SnickersDispenser(SnackDispenseHandler next) {
        super(next);
    }
    @Override
    public void handleRequest(Snack requestType) {
        if(requestType instanceof Snickers){
            if(requestType.avalibility()) {
                requestType.dispense();
            }
        }
        else{
            super.handleRequest(requestType);
        }
    }
}
