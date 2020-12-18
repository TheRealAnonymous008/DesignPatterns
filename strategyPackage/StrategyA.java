package strategyPackage;

import java.util.Vector;

public class StrategyA implements Strategy{
	// implements the Strategy interface
	@Override
	// args is optional
	public void algorithm(Vector<Integer> args) {
		System.out.println(args.size());
	}
}
