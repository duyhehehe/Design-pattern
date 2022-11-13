public class SlackNotify extends NotifierDecorator{
    public SlackNotify(Notifier n) {
        super(n);
    }

    @Override
    public void send() {
        super.send();
        notifySl();
    }
    public void notifySl(){
        System.out.println("Slack notify");
    }
}
