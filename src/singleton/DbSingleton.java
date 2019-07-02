package singleton;

public class DbSingleton {
	private static volatile DbSingleton instance = null;
	
	private DbSingleton() {
		// This to protect against reflection for modifying your instance
		if (instance != null) {
			throw new RuntimeException("Please use get instance() to create");
		}
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
	// Not thread safe
	
//	public static DbSingleton getInstance() {
//		
//		if (instance == null) {
//			instance = new DbSingleton();
//		}
//		return instance;
//	}
	

}
