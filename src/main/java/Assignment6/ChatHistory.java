package Assignment6;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ChatHistory implements IterableByUser  {
    private List<Message> history;
    private MessageMemento memento;
    public ChatHistory(MessageMemento memento){
         history= new LinkedList<>();
         this.memento= memento;
    }
    public void addMessage(Message message){
        history.add(message);
    }
    public List<Message> getChatHistory(){
        return history;
    }
    public Message lastMessageSent(){
        return memento.getMessage();
    }

    @Override
    public SearchMessagesByUser iterator(User userToSearchWith) {
        return new SearchMessagesByUser(userToSearchWith,getChatHistory());
    }
}
