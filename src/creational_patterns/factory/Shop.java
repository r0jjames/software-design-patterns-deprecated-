package creational_patterns.factory;

public class Shop extends Website {

	@Override
	void createWebsite() {
		// TODO Auto-generated method stub
		this.pages.add(new CartPage());
		this.pages.add(new ItemPage());
		this.pages.add(new SearchPage());
	}

}
