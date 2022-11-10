import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Item> menu=new ArrayList<>();
    public void add(Item item){
        menu.add(item);
    }
    public ItemIterator<Item> iterator(){
        return new MenuIterator();
    }
    private class MenuIterator implements ItemIterator<Item> {
        private Integer currentPosition=0;
        @Override
        public boolean hasNext() {
            return currentPosition< menu.size();
        }

        @Override
        public Item next() {
            return menu.get(currentPosition++);
        }
    }
}
