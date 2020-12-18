package strategyPackage;

import java.util.Vector;

public class Context {
	// the context is configured with a strategy object and can access
	// and use this strategy object
	
	private Vector<Integer> data = new Vector<>();
	private Strategy A = new StrategyA();
	private Strategy B = new StrategyB();
	
	// for adding parameters
	public void addData(int d) {
		data.add(d);
	}
	
	
	// when we want to call the strategy we can do so
	public void getLength() {
		A.algorithm(data);
	}
	
	public void getSum() {
		B.algorithm(data);
	}
}
