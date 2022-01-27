package subasta;

import subasta.model.Item;
import subasta.view.AuctionListDisplay;
import java.util.List;

public class MockAuctionListDisplay implements AuctionListDisplay {

    @Override
    public void display(List<Item> items) {
        for (Item item : items) {
            System.out.println("Item: " + item.getName());
        }
    }
}
