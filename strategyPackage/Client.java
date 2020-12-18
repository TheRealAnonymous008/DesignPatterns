package strategyPackage;

import java.util.Random;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Initialize context
		Context context = new Context();
		Random random = new Random(100);
		
		// Initialize data for context
		int r = random.nextInt(100);
		for(int i = 0; i < r; i ++) {
			Random newRand = new Random(random.nextInt());
			context.addData(newRand.nextInt());
		}
		
		// we can then call strategies from the context
		context.getLength();
		context.getSum();
	}

}
