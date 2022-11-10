public class ClientTest {
    public static void main(String[] args) {
        EagerInitialization eager1 = EagerInitialization.getInstance();
        eager1.setName("Duy");
        System.out.println(eager1.getName());
        EagerInitialization eager2 = EagerInitialization.getInstance();
        eager2.setName("Hehe");
        System.out.println(eager1.getName());
        System.out.println(eager2.getName());
    }
}
