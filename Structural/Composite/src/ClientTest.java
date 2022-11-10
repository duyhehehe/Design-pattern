public class ClientTest {
    public static void main(String[] args) {
        Boss boss = new Boss(60, "Duy", 9000);
        BusinessAnalyst businessAnalyst = new BusinessAnalyst(27, "Huyen", 2100);
        Leader leader = new Leader(80, "Huy", 5000);
        Developer dev1 = new Developer(18, "Duong", 2000);
        Developer dev2 = new Developer(16, "Duyen", 1200);
        leader.add(dev1);
        leader.add(dev2);
        boss.add(leader);
        boss.add(businessAnalyst);
        boss.print();
    }
}
