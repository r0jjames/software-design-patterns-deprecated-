package creational_patterns.abstract_factory;

public class VisaFactory extends CreditCardFactory {

	@Override
	public CreditCard getCreditCard(CardType cardType) {
		// TODO Auto-generated method stub
		switch(cardType) {
			case GOLD: 
				return new VisaGoldCreditCard();
			case PLATINUM:
				return new VisaBlackCreditCard();
		}
		return null;
	}

	@Override
	public Validator getValidator(CardType cardType) {
		// TODO Auto-generated method stub
		return new VisaValidator();
	}

}
