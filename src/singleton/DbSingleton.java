package singleton;

public class DbSingleton {
	private static volatile DbSingleton instance = null;
	
	private DbSingleton() {
		if (instance != null) {
			throw new RuntimeException("Please use get instance() to create");
		}
		System.out.println("TEST");
	}
	
	// Thread safe
	public static DbSingleton getInstance() {
		
		if (instance == null) {
			synchronized(DbSingleton.class) {
				if (instance == null) {
					instance = new DbSingleton();
				}
			}
		}
		return instance;
	}
	

}
