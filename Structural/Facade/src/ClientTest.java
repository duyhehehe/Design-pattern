public class ClientTest {
    public static void main(String[] args) {
        FurnitureFacade furnitureFacade=FurnitureFacade.getInstance();
        furnitureFacade.makeTelevisionAndChair();
        furnitureFacade.makeTableAndChair();
    }
}
