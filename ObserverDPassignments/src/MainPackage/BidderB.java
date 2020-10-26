package MainPackage;

public class BidderB implements Observer{

	@Override
	public void getUpdate(int currentBid) {
		// TODO Auto-generated method stub
		System.out.println("For Bidder B:\n Current Bid: " + currentBid);
	}

}
