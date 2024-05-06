package Assignment8.ChainOfResponsibility;

import Assignment8.Snacks.Cheetos;
import Assignment8.Snacks.Coke;
import Assignment8.Snacks.Snack;

public class CokeDispenser extends SnackDispenseHandler{
    public CokeDispenser(SnackDispenseHandler next) {
        super(next);
    }
    @Override
    public void handleRequest(Snack requestType) {
        if(requestType instanceof Coke){
            if(requestType.avalibility()) {
                 requestType.dispense();
            }
        }
        else{
        super.handleRequest(requestType);
        }
    }
}
