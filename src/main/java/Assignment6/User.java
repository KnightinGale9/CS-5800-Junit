package Assignment6;


import java.util.LinkedList;
import java.util.List;

public class User implements IterableByUser{
     private String name;
     private ChatHistory chat;
     private MessageMemento memento;
     public User(String name){
         this.name=name;
         memento= new MessageMemento();
         chat = new ChatHistory(memento);
     }

     public void lastMessageSent(Message message){
         memento.setMessage(message);
     }
     public void undoLastMessageSent(){
         for(User user:memento.getMessage().getRecipient()){
             user.getChatHistory().remove(memento.getMessage());
         }
     }
     public void recieveMessage(Message message){
         this.chat.addMessage(message);
     }
     public List<Message> getChatHistory(){
         return chat.getChatHistory();
     }
     public List<Message> getMessagesWithUser(User userToSearchWith){
         SearchMessagesByUser search =  iterator(userToSearchWith);
         List<Message> output = new LinkedList<>();
         while(search.hasNext()){
             output.add(search.next());
         }
         return output;
     }
     @Override
     public SearchMessagesByUser iterator(User userToSearchWith) {
         return chat.iterator(userToSearchWith);
     }
}
