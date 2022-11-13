public class EmailNotifier implements Notifier{
    Notifier component;
    @Override
    public void send() {
        System.out.println("Gmail notifier");
    }
}
