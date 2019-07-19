package creational_patterns.prototype;

public class PrototypeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Registry registry = new Registry();
		Movie movie = (Movie) registry.createItem("Movie");
		movie.setTitle("Creational Patterns - Prototype in Java");
		
		System.out.println(movie);
		System.out.println(movie.getRuntime());
		System.out.println(movie.getTitle());
		System.out.println(movie.getUrl());

		Movie anotherMovie = (Movie) registry.createItem("Movie");
		anotherMovie.setTitle("Update Creational Patterns - Prototype in Java");
		
		System.out.println(anotherMovie);
		System.out.println(anotherMovie.getRuntime());
		System.out.println(anotherMovie.getTitle());
		System.out.println(anotherMovie.getUrl());

	}

}
