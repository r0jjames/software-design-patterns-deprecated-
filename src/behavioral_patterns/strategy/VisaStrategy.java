package behavioral_patterns.strategy;

public class VisaStrategy extends ValidationStrategy {

	@Override
	boolean isValid(CreditCard creditCard) {
		
		boolean isValid = creditCard.getNumber().startsWith("4") && creditCard.getNumber().length() == 16;
		
		if (isValid) {
			isValid = passesLuhn(creditCard.getNumber());
		}

		return isValid;
	}

}
