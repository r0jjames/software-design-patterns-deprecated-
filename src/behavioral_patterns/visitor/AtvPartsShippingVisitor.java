package behavioral_patterns.visitor;

import java.util.List;

public class AtvPartsShippingVisitor implements AtvPartVisitor {

	double shippingAmount = 0;
	
	@Override
	public void visit(Fender fender) {
		// TODO Auto-generated method stub

		shippingAmount += 15;
	}

	@Override
	public void visit(Oil oil) {
		// TODO Auto-generated method stub
		shippingAmount += 20;

	}

	@Override
	public void visit(Wheel wheel) {
		// TODO Auto-generated method stub

		shippingAmount += 25;
	}

	@Override
	public void visit(PartsOrder partsOrder) {
		// TODO Auto-generated method stub
		System.out.println("If they bought more than 3 things we will give them a discount on shipping");
		List<AtvPart> parts = partsOrder.getParts();
		if (parts.size() > 3) {
			shippingAmount -= 5;
		}
		System.out.println("Shipping amount is: " + shippingAmount);

	}

}
