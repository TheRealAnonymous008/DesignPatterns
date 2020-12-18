package interpreterPackage;

import java.util.concurrent.ArrayBlockingQueue;

public class NonTerminalExpression implements AbstractExpression{
	Context context;
	
	
	
	// breaks down the context into simpler expressions.
	public void interpret() {
		// do some parsing here
		// lets say in our grammar, terminal symbols are separated
		// by :
		String[] terms = context._context.split(":");
		
		// the non terminal expressions recursively then interpret
		// these terms
		
		TerminalExpression[] exps = new TerminalExpression[terms.length];
		
		for(int i = 0; i < terms.length; i++) {
			exps[i] = new TerminalExpression();
			exps[i].setContext(new Context(terms[i]));
			exps[i].interpret();
		}
		
		
	}


	@Override
	public void setContext(Context context) {
		// TODO Auto-generated method stub
		this.context = context;
	}
}
