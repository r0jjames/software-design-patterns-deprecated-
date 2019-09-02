package behavioral_patterns.visitor;

public class Fender implements AtvPart {

	@Override
	public void accept(AtvPartVisitor visitor) {
		visitor.visit(this);
		
	}

}
