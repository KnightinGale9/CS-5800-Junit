package Assignment6;

public class driver {
    public static void main(String[] args) {
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
        server.sendMessage(user[1],"Have you done CS5800 homework?",user[0]);
        for(User u: user){
            System.out.println(u);
        }
        //Users can undo the last message they sent using the Memento design pattern.
        user[1].undoLastMessageSent();
        for(User u: user){
            System.out.println(u);
        }
        //Users can block messages from specific users using the Mediator design pattern.
        server.blockUser(user[2],user[0]);
        for(User u: user){
            System.out.println(u);
        }
        //Users can receive messages from other users and view the chat history for a specific user.
        server.printChatHistroy(user[0]);

        user[0].printMessagesWithUser(user[2]);
    }
}
