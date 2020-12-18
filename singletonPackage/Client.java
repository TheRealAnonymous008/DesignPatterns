package singletonPackage;

public class Client {

	public static void main(String[] args) {
		// Now the method can just call the singleton
		Singleton s1 = Singleton.getSingletonInstance();
		Singleton s2 = Singleton.getSingletonInstance();
		
		
		// Since one instance is maintained for the singleton, 
		// we should see the same address.
		System.out.println(s1);
		System.out.println(s2);
	}

}
