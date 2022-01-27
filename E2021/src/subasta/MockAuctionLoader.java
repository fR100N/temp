package subasta;

import subasta.model.Item;
import subasta.view.AuctionLoader;
import subasta.view.Observer;
import subasta.view.Subject;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class MockAuctionLoader implements AuctionLoader {
    private List<Item> items = new ArrayList<>();
    
    @Override
    public List<Item> load() {
        Item producto1 = new Item("Apple MackBookPro 2019", "Ordenador en perfecto estado", 600.0, 600.0, LocalDateTime.now());
        Item producto2 = new Item("Apple Iphone", "Movil en perfecto estado", 300.0, 300.0, LocalDateTime.now());
        items.add(producto1);
        items.add(producto2);
        return items;
    }
}
