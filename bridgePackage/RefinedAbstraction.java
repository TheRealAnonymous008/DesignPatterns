package bridgePackage;

public class RefinedAbstraction extends Abstraction{
	public RefinedAbstraction(Implementor imp) {
		super(imp);
	}
	
	public void operation() {
		_imp.operationImp();
	}
}
