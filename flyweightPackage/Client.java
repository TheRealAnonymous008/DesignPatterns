package flyweightPackage;

public class Client {

	public static void main(String[] args) {
		// When the client needs flyweights, just call on 
		// the FlyweightFactory
		
		FlyweightFactory ff = new FlyweightFactory();
		
		// make requests to flyweight factory:
		ff.GetFlyweight(1);
		ff.GetFlyweight(2);
		ff.GetFlyweight(3);
		ff.GetFlyweight(3);
		
		
		// To check the current list in flyweight we can print
		// its hash set
		ff.displayCache();
		
		// As we can see, only unique states are recorded.
		
		// If we need to get requests to the flyweights 
		// we can also do so:
		
		ff.GetFlyweight(1).operation();
		ff.GetFlyweight(2).operation();
		ff.GetFlyweight(3).operation();
		ff.GetFlyweight(10).operation();
	}

}
