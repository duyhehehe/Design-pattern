public class FurnitureFacade { //Singleton
    private static FurnitureFacade instance;
    private Furniture table;
    private Furniture television;
    private Furniture chair;

    private FurnitureFacade() {
        table=new Table();
        chair=new Chair();
        television=new Television();
    }
    public static FurnitureFacade getInstance(){
        if(instance==null){
            instance=new FurnitureFacade();
        }
        return instance;
    }
    public void makeTableAndChair(){
        table.make();
        chair.make();
    }
    public void makeTelevisionAndChair(){
        television.make();
        chair.make();
    }
}
