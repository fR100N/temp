package subasta;

import subasta.model.Item;
import subasta.view.AuctionDisplay;

public class MockAuctionDisplay implements AuctionDisplay {

    @Override
    public void display(Item item) {
        System.out.println("Displaying: " + item.getName());
    }
}
