package MainPackage;

import java.util.ArrayList;

public class AuctionHandler
{
	ArrayList<Observer> bidders= new ArrayList<Observer>();
	
	public AuctionHandler(Observer ob, int cb)
	{
		this.bidders=(ArrayList<Observer>) ob;
		//this.currentBid=cb;
		
	}
	public AuctionHandler()
	{
			
	}
	
	public void includeBidder(Observer bidder) {
		bidders.add(bidder);
		
	}


	public void removeBidder(Observer bidder) {
		bidders.remove(bidder);
		
	}

	
	public void notifyBidders(int bid) {
	
		for(Observer obs: bidders)
		{
			obs.getUpdate(bid);
			
		}
	}
	

}
