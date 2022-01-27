package subasta.control;

import subasta.MockAuctionLoader;
import subasta.model.Item;
import subasta.view.AuctionDisplay;
import subasta.view.AuctionListDisplay;
import subasta.view.AuctionLoader;
import java.util.List;

public class MonitorAuctionCommand implements Command {
    private final AuctionListDisplay auctionListDisplay;
    private final AuctionDisplay auctionDisplay;
    private final AuctionLoader auctionLoader;

    public MonitorAuctionCommand(AuctionListDisplay auctionListDisplay, AuctionDisplay auctionDisplay, AuctionLoader auctionLoader) {
        this.auctionListDisplay = auctionListDisplay;
        this.auctionDisplay = auctionDisplay;
        this.auctionLoader = auctionLoader;
    }
    
    @Override
    public void execute() {
        this.auctionListDisplay.display(auctionLoader.load());
    }
}
