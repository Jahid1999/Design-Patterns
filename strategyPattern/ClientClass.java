package strategyPattern;

public class ClientClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shopping sp = new Shopping(new BkashPayment());
		sp.getPaymentType().pay();

		
		Shopping sp1 = new Shopping(new RocketPayment());
		sp1.getPaymentType().pay();

	}

}
