public class ClientTest {
    public static void main(String[] args) {
        House house1 = new HouseBuilder()
                .buildWalls(4)
                .buildDoors(2)
                .buildColor("Red")
                .buildRoof(true)
                .build();
        System.out.println(house1);
    }
}
