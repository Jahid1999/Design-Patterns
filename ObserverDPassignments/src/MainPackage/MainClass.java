package MainPackage;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		AuctionHandler auction = new AuctionHandler();
		Observer a = new BidderA();
		Observer b = new BidderB();
		Observer c = new BidderC();
		Observer d = new BidderD();
		
		auction.includeBidder(a);
		auction.includeBidder(b);
		auction.includeBidder(c);
		auction.includeBidder(d);
		 int bid=0;
		 while(true){
			 System.out.println("Enter 0 to exit and 1 to bid");
	    		int choice = in.nextInt();
	    		if(choice==0)
	    			break;
	    		else if(choice==1)
	    		{
	    			bid++;
	    			auction.notifyBidders(bid);
	    		}
		 }

	}

}
