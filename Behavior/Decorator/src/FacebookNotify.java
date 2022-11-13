public class FacebookNotify extends NotifierDecorator{
    public FacebookNotify(Notifier n) {
        super(n);
    }

    @Override
    public void send() {
        super.send();
        notifyFb();
    }
    public void notifyFb(){
        System.out.println("Facebook notify");
    }
}
