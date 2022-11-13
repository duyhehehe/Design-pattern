public class NotifierDecorator implements Notifier {
    Notifier component;

    public NotifierDecorator(Notifier n) {
        component = n;
    }

    @Override
    public void send() {
        component.send();
    }
}
