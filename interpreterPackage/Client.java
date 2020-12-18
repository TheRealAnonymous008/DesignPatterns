package interpreterPackage;

public class Client {

	public static void main(String[] args) {
		// Now to make use of our interpretter, just make
		// a nonterminal expression
		
		Context context = new Context("One:Two:Three");
		NonTerminalExpression nte = new NonTerminalExpression();
		nte.setContext(context);
		nte.interpret();
	}

}
