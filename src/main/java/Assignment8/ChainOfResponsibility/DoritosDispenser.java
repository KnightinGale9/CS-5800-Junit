package Assignment8.ChainOfResponsibility;

import Assignment8.Snacks.Doritos;
import Assignment8.Snacks.Snack;

public class DoritosDispenser extends SnackDispenseHandler{
    public DoritosDispenser(SnackDispenseHandler next) {
        super(next);
    }
    @Override
    public void handleRequest(Snack requestType) {
        if(requestType instanceof Doritos){
            if(requestType.avalibility()) {
                requestType.dispense();
            }
        }
        else{
        super.handleRequest(requestType);
        }
    }
}
