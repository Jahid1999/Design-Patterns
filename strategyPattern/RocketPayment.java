package strategyPattern;

public class RocketPayment implements PaymentType {
	
	public RocketPayment() {		
		
	}
	
	public void pay()
	{
		System.out.println("Payment done by Rocket");
	}

}
