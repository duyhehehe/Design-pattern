public class ClientTest {
    public static void main(String[] args) {
        Menu menu=new Menu();
        menu.add(new Item("Nguyen","https://google.com"));
        menu.add(new Item("Hoang","https://facebook.com"));
        menu.add(new Item("Duy","https://youtube.com"));
        ItemIterator<Item> iterator=menu.iterator();
        while (iterator.hasNext()){
            Item item=iterator.next();
            System.out.println(item.getTitle());
        }
    }
}
