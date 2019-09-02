package behavioral_patterns.template;

public abstract class OrderTemplate {
	
	public boolean isGift;
	protected abstract void doCheckout();
	protected abstract void doPayment();
	protected abstract void doReceipt();
	protected abstract void doDeliver();
	
	public void wrapGift() {
		System.out.println("Gift wrapped");
	}
	public final  void processOrder() {
		doCheckout();
		doPayment();
		
		if (isGift) {
			wrapGift();
		} else {
			doReceipt();
		}
		doDeliver();
	}

}
