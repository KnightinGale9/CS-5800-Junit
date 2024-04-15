package Assignment6;

import java.util.*;

public class ChatServer {
    private Set<User> currentUsers;
    private Map<User,Set<User>> block;
    public ChatServer() {
        this.currentUsers = new HashSet<>();
        block= new HashMap<>();
    }
    public void addUser(User name){
        currentUsers.add(name);
        block.put(name,new HashSet<>());
    }
    public void removeUser(User name){
        currentUsers.remove(name);
        block.remove(name);
    }
    public void blockUser(User sender, User recipient){
        block.get(sender).add(recipient);
        sender.removeBlockMessage(recipient);
    }
    public void sendMessage(User sender, String message,User ... recipient)
    {
        Message generate = new Message(sender,new HashSet<>(List.of(recipient)),message);
        sender.lastMessageSent(generate);
        sender.recieveMessage(generate);
        for(User user: recipient) {
            if (!block.get(user).contains(sender)) {
                user.recieveMessage(generate);
            }
        }
    }
    public void printChatHistroy(User view){
        System.out.println(view.toString());
    }


}
