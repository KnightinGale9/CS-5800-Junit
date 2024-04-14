package Assignment6;

public class driver {
    public static void main(String[] args) {
        User zhong = new User("Zhong");
        User tim = new User("Tim");
        User logan = new User("Logan");

        ChatServer server = new ChatServer();
        server.addUser(zhong);
        server.addUser(tim);
        server.addUser(logan);

        server.sendMessage(zhong,"When do you guys want to hang out",tim,logan);
        server.blockUser(zhong,tim);
        zhong.undoLastMessageSent();
        System.out.println("debug");
    }
}
