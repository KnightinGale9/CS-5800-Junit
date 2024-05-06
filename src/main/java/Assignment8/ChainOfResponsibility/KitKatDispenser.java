package Assignment8.ChainOfResponsibility;

import Assignment8.Snacks.Cheetos;
import Assignment8.Snacks.KitKat;
import Assignment8.Snacks.Snack;

public class KitKatDispenser extends SnackDispenseHandler{
    public KitKatDispenser(SnackDispenseHandler next) {
        super(next);
    }
    @Override
    public void handleRequest(Snack requestType) {
        if(requestType instanceof KitKat){
            if(requestType.avalibility()) {
                requestType.dispense();
            }
        }
        else{
            super.handleRequest(requestType);
        }
    }
}
