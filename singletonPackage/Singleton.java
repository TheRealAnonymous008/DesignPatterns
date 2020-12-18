package singletonPackage;

public class Singleton {
	// The singleton ensures that only one instance of this singleton
	// exists globally.
	
	// The singleton itself is responsible for this
	// The static modifier ensures only one instance;
	private static Singleton instance = new Singleton();
	
	private Singleton() {
		// Leave a private method so no one can make new singletons
	}
	public static Singleton getSingletonInstance() {
		return instance;
	}
	
	
}
