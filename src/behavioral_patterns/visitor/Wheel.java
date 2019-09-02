package behavioral_patterns.visitor;

public class Wheel implements AtvPart {

	@Override
	public void accept(AtvPartVisitor visitor) {
		visitor.visit(this);
		
	}
}
