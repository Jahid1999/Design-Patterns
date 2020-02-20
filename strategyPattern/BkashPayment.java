package strategyPattern;

public class BkashPayment implements PaymentType {
	
	public BkashPayment() {		
		
	}
	
	public void pay()
	{
		System.out.println("Payment done by Bkash");
	}

}
