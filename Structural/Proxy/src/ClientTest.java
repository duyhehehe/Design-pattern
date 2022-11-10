public class ClientTest {
    public static void main(String[] args) {
        ProxyImage proxyImage=new ProxyImage("https://google.com");
        System.out.println("First load");
        proxyImage.load();
        System.out.println("Second load");
        proxyImage.load();
    }
}
