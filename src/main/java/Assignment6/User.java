package Assignment6;


import javax.swing.plaf.synth.SynthTextAreaUI;
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
    public String getName(){
         return name;
    }
     public void lastMessageSent(Message message){
         memento.setMessage(message);
     }
     public void undoLastMessageSent(){
         for(User user:memento.getMessage().getRecipient()){
             user.getChatHistory().remove(memento.getMessage());
         }
         this.getChatHistory().remove(memento.getMessage());
     }
     public void recieveMessage(Message message){
         this.chat.addMessage(message);
     }
     public void removeBlockMessage(User block){
         for(Message mess: chat.getChatHistory()){
             if(mess.getSender().equals(block)){
                 this.getChatHistory().remove(mess);
             }
         }
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
    public void printMessagesWithUser(User userToSearchWith){
         String temp="Messages with "+userToSearchWith.getName()+": ";
        for(Message mess:this.getMessagesWithUser(userToSearchWith)){
            temp+=mess;
        }
        System.out.println(temp);
    }
     @Override
     public SearchMessagesByUser iterator(User userToSearchWith) {
         return chat.iterator(userToSearchWith);
     }

    @Override
    public String toString() {
        return String.format("%s: %s",name,chat.toString());
    }
}
