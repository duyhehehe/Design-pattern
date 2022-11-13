public class ClientTest {
    public static void main(String[] args) {
        Notifier n=new EmailNotifier();
        n=new FacebookNotify(n);
        n=new SMSNotifier(n);
        n.send();
    }
}
