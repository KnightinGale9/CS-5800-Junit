package Assignment6;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.Set;

public class Message{
    private User sender;
    private Set<User> recipient;
    private String timestamp;
    private String message;

    public Message(User sender, Set<User> recipient, String message) {
        this.sender = sender;
        this.recipient = recipient;
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        this.timestamp = dateFormat.format(date);
        this.message = message;
    }

    public User getSender() {
        return sender;
    }

    public Set<User> getRecipient() {
        return recipient;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        String temp="";
        for(User u: recipient)
        {
            temp+=u.getName();
            temp+= ",";
        }
        return String.format("[Sender:%s,Recipient:%s %s:%s]",sender.getName(),temp,timestamp,message);
    }
}
