package Assignment6;
import Assignment6.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class SendingMessageTest {

    @Test
    public void SendingMessageSender(){
        User[] user = new User[3];
        user[0]=new User("Zhong");
        user[1]=new User("Tim");
        user[2]=new User("Logan");

        ChatServer server = new ChatServer();
        for(User u: user){
            server.addUser(u);
        }
        //Users can send messages to one or more other users through the chat server.
        server.sendMessage(user[0],"When do you guys want to hang out",user[1],user[2]);
        assertTrue(user[0].toString().matches("Zhong:\\s*\\[\\s*\\[Sender:Zhong,Recipient:.*:When\\s*do\\s*you\\s*guys\\s*want\\s*to\\s*hang\\s*out]\\s*\\]"));

    }
    @Test
    public void SendingMessageRecipient(){
        User[] user = new User[3];
        user[0]=new User("Zhong");
        user[1]=new User("Tim");
        user[2]=new User("Logan");

        ChatServer server = new ChatServer();
        for(User u: user){
            server.addUser(u);
        }
        //Users can send messages to one or more other users through the chat server.
        server.sendMessage(user[0],"When do you guys want to hang out",user[1],user[2]);
        assertTrue(user[2].toString().matches("Logan:\\s*\\[\\s*\\[Sender:Zhong,Recipient:.*:When\\s*do\\s*you\\s*guys\\s*want\\s*to\\s*hang\\s*out]\\s*\\]"));

    }
    @Test
    public void BlockingUser(){
        String expected="Tim: [ ]";
        User[] user = new User[2];
        user[0]=new User("Zhong");
        user[1]=new User("Tim");

        ChatServer server = new ChatServer();
        for(User u: user){
            server.addUser(u);
        }
        //Users can send messages to one or more other users through the chat server.
        server.sendMessage(user[0],"What are you doing",user[1]);
        server.blockUser(user[1],user[0]);
        assertEquals(user[1].toString(),expected);
    }
    @Test
    public void UndoMessage(){
        String expected="Tim: [ ]";
        User[] user = new User[2];
        user[0]=new User("Zhong");
        user[1]=new User("Tim");

        ChatServer server = new ChatServer();
        for(User u: user){
            server.addUser(u);
        }
        //Users can send messages to one or more other users through the chat server.
        server.sendMessage(user[1],"This message will be recalled",user[0]);
        user[1].undoLastMessageSent();
        assertEquals(user[1].toString(),expected);
    }
}
