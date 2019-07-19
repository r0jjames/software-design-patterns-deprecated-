package creational_patterns.builder.Lunch;

public class BuilderLunchOrderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LunchOrder.Builder builder = new LunchOrder.Builder();
		
		builder.bread("Wheat").condiments("Lettuce").dressing("Mayo").meat("Turkey");
		
		LunchOrder lunchOrder = builder.build();
		
		System.out.println(lunchOrder.getBread());
		System.out.println(lunchOrder.getCondiments());
		System.out.println(lunchOrder.getDressing());
		System.out.println(lunchOrder.getMeat());

	}

}
