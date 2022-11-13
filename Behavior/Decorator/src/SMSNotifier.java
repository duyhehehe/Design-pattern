public class SMSNotifier extends NotifierDecorator{
    public SMSNotifier(Notifier n) {
        super(n);
    }

    @Override
    public void send() {
        super.send();
        notifySMS();
    }
    public void notifySMS(){
        System.out.println("SMS notify");
    }
}
