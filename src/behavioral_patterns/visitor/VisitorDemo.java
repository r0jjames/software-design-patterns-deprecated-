package behavioral_patterns.visitor;

public class VisitorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PartsOrder order = new PartsOrder();
		order.addPart(new Oil());
		order.addPart(new Fender());
		order.addPart(new Wheel());
		
		order.accept(new AtvPartsShippingVisitor());
		order.accept(new AtvPartsDisplayVisitor());
	}

}
