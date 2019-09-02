package behavioral_patterns.visitor;

public class AtvPartsDisplayVisitor implements AtvPartVisitor {

	@Override
	public void visit(Fender fender) {
		// TODO Auto-generated method stub
		System.out.println("We have fender");
	}

	@Override
	public void visit(Oil oil) {
		// TODO Auto-generated method stub
		System.out.println("We have oil");
	}

	@Override
	public void visit(Wheel wheel) {
		// TODO Auto-generated method stub
		System.out.println("We have wheel");

	}

	@Override
	public void visit(PartsOrder partsOrder) {
		// TODO Auto-generated method stub
		System.out.println("We have parts");

	}

}
