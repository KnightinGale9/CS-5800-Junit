package Assignment6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SearchMessagesByUser implements Iterator {
    private User other;
    private int indexInHistory;
    private int historySize;
    private List<Message> history;
    public SearchMessagesByUser(User user,List<Message> iterable) {
        this.other=user;
        this.history = new ArrayList<>(iterable);
        this.indexInHistory=0;
        historySize=iterable.size();
    }
    @Override
    public boolean hasNext() {
        Message message = null;
        while(indexInHistory<historySize){
            message = history.get(indexInHistory);
            if(message.getSender().equals(other)||message.getRecipient().contains(other)){
                return true;
            }
            else {
                indexInHistory++;
            }
        }
        return false;
    }

    @Override
    public Message next() {
        if(hasNext()){
            return history.get(indexInHistory++);
        }
        return null;
    }
}
