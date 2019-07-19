package creational_patterns.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {
	
	private Map<String, Item> items = new HashMap<String, Item>();
	
	public Registry() {
		this.loadItems();
	}
	
	public Item createItem(String type) {
		Item item = null;
		
		try {
			item = (Item) items.get(type).clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return item; 
	}
	
	
	private void loadItems() {
		Movie movie = new Movie();
		movie.setTitle("Basic Movie");
		movie.setPrice(24.99);
		movie.setRuntime("2 hrs");
		items.put("Movie", movie);
		
		Book book = new Book();
		book.setTitle("Basic Book");
		book.setNumberOfPages(335);
		book.setPrice(99.9);
		items.put("Book", book);
	}
	
	

}
