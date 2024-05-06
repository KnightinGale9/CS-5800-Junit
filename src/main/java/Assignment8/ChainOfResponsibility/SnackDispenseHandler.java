package Assignment8.ChainOfResponsibility;

import Assignment8.Snacks.Snack;

public abstract class SnackDispenseHandler {
    private SnackDispenseHandler next;

    public SnackDispenseHandler(SnackDispenseHandler next) {
        this.next = next;
    }
    public void handleRequest(Snack requestType) {
        if(next != null) {
            next.handleRequest(requestType);
        }
    }

}
