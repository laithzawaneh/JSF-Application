package dp.facade;

public class OrderFacade {

	public void placeOrder() {
		Prodact prodact = new Prodact();
		prodact.getProdactDetails();
		 
		Payment payment =new Payment();
		payment.makePayment();
		
		Invoice invoice = new Invoice();
		invoice.sendInvoice();
	}
	
}
