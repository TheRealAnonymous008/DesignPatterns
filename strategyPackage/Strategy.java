package strategyPackage;

import java.util.Vector;

public interface Strategy {
	// Defines an interface common to all strategy classes
	
	// the algorithm function below is called by context when needed
	public void algorithm(Vector<Integer> args);
}
