package interpreterPackage;

public interface AbstractExpression {
	// Declares an abstractoperation that is common
	// to all nodes in the AST
	
	public void interpret();
	public void setContext(Context context);
}
