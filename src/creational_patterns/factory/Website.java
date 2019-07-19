package creational_patterns.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {
	protected List<Page> pages = new ArrayList<Page>();

	public List<Page> getPages() {
		return pages;
	}

	public void setPages(List<Page> pages) {
		this.pages = pages;
	}
	
	public Website() {
		System.out.println("Website constructor");
		this.createWebsite();
	}
	abstract void createWebsite();

}
