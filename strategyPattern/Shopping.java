package strategyPattern;

public class Shopping {
	
	PaymentType pt;
	
	public Shopping(PaymentType pt )
	{
		this.pt=pt;
	}
	
	public PaymentType getPaymentType() {
		
		return this.pt;
	}
	
	
}
