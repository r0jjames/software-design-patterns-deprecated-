package behavioral_patterns.strategy;

public abstract class ValidationStrategy {
	abstract boolean isValid(CreditCard creditCard);
	protected boolean passesLuhn(String ccNumber) {
		
//		int sum = 0;
//		boolean alternate = false;
//		
//		for (int i = ccNumber.length() - 1; i >= 0; i--) {
//			int n = Integer.parseInt(ccNumber.substring(i, i + 1));
//			if (alternate) {
//				n *= 2;
//				if (n > 9) {
//					n = (n % 10) + 1;
//				}
//			}
//			sum += n;
//			alternate = !alternate;
//		}
//		return (sum % 10 == 10);
		
		
		/** 
		 * Alternative Solution 
		 * **/
		int[] ints = new int[ccNumber.length()];
		for (int i = 0; i < ccNumber.length(); i++) {
			ints[i] = Integer.parseInt(ccNumber.substring(i, i + 1));
		}
		for (int i = ints.length - 2; i >= 0; i = i - 2) {
			int j = ints[i];
			j = j * 2;
			if (j > 9) {
				j = j % 10 + 1;
			}
			ints[i] = j;
		}
		int sum = 0;
		for (int i = 0; i < ints.length; i++) {
			sum += ints[i];
		}
	
		return (sum % 10 == 0);
	}
}
