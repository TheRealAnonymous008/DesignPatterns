package strategyPackage;

import java.util.Vector;

public class StrategyB implements Strategy{

	@Override
	public void algorithm(Vector<Integer> args) {
		int sum = 0;
		for (int i : args) {
			sum += i;
		}
		System.out.println(sum);
	}

}
