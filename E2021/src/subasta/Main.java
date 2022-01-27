package subasta;

import subasta.control.MonitorAuctionCommand;
import subasta.model.Bidder;
import subasta.model.Item;
import subasta.view.AuctionDisplay;
import subasta.view.AuctionListDisplay;
import subasta.view.AuctionLoader;
import subasta.view.Observer;
import subasta.view.Subject;
import java.time.LocalDateTime;

public class Main {
    private final AuctionDisplay auctionDisplay;
    private final AuctionListDisplay auctionListDisplay;
    private final AuctionLoader auctionLoader;

    public Main() {
        this.auctionDisplay = new MockAuctionDisplay();
        this.auctionListDisplay = new MockAuctionListDisplay();
        this.auctionLoader = new MockAuctionLoader();
    }

    private void execute() {
        new MonitorAuctionCommand(auctionListDisplay, auctionDisplay, auctionLoader).execute();
    }
    
    public static void main(String[] args) {
        //new Main().execute();
        
        Subject producto = new Item("Apple MackBookPro 2019", "Ordenador en perfecto estado", 600.0, 600.0, LocalDateTime.now());
        
        Observer bidder1 = new Bidder("Natanael");
        Observer bidder2 = new Bidder("Pablo");
        Observer b3 = new Bidder("Alejandro");
        
        producto.registerObserver(bidder1);
        producto.registerObserver(bidder2);
        producto.registerObserver(b3);
        
        producto.setNewBid(bidder1, 700.0);
        producto.removeObserver(bidder2);
        producto.setNewBid(b3, 800.0);
        producto.setNewBid(b3, 1000.0);
    }
}
