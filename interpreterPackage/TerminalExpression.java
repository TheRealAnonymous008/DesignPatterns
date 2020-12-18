package interpreterPackage;

public class TerminalExpression implements AbstractExpression{
	Context context;
	public void interpret() {
		// Terminal expression represent the words in our grammar
		System.out.println(context._context + " test");
	}

	@Override
	public void setContext(Context context) {
		this.context = context;
		
	}
	
	
}
