interface Message {
    void say();
}

public class LambdaDemo {

    public static void main(String[] args) {

        Message m = () -> {
            System.out.println("Hello from Lambda");
        };

        m.say();
    }
}