package creational_patterns.factory;

public class Blog extends Website {

	@Override
	void createWebsite() {
		// TODO Auto-generated method stub
		this.pages.add(new PostPage());
		this.pages.add(new AboutPage());
		this.pages.add(new CommentPage());
		this.pages.add(new ContactPage());
	}

}
