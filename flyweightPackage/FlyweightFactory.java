package flyweightPackage;

import java.util.WeakHashMap;

public class FlyweightFactory {
	// The flyweight factory manages the flyweights
	// This is done through a hash set keeping track of instances
	private static final WeakHashMap<Integer, Flyweight> CACHE =
			new WeakHashMap<>();
	
	
	public Flyweight GetFlyweight(int key) {
		// return the flyweight if it has already been instantiated
		if(CACHE.containsKey(key))
			return CACHE.get(key);
		else {
			// If it is not in the cache then put it in the cache
			Flyweight f = new Flyweight(key);
			CACHE.put(key, f);
			// then return that instance
			return f;
		}
	}
	
	public void displayCache() {
		for (int key : CACHE.keySet()) {
			System.out.println(key + " " + CACHE.get(key));
		}
	}
	
	
}
