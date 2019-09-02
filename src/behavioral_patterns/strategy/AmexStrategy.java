package behavioral_patterns.strategy;

public class AmexStrategy extends ValidationStrategy {

	@Override
	boolean isValid(CreditCard creditCard) {
		boolean isValid = creditCard.getNumber().startsWith("34") || creditCard.getNumber().startsWith("37");
		
		if (isValid) {
			isValid = creditCard.getNumber().length() == 15 && passesLuhn(creditCard.getNumber());
		}
		
		return isValid;
	}

}
