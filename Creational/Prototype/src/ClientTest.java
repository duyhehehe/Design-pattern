public class ClientTest {
    public static void main(String[] args) {
        User user1 = new User("Duy", "duy@gmail.com", 19);
        User user2 = user1.clone();
        System.out.println("User 1: " + user1);
        System.out.println("User 2: " + user2);
        System.out.println();

        user1.setAge(25);
        System.out.println("User 1: " + user1);
        System.out.println("User 2: " + user2);
    }
}
