package iteratorPackage;

public class Iterator {
	// The iterator keeps track of the current position on
	// the aggregate
	private Aggregate _aggregate;
	private int _currPos = 0;
	public Iterator(Aggregate agg) {
		_aggregate = agg;
	}
	
	// The iterator must implement the following functions
	public Object first() {
		return _aggregate.getComponents()[0];
	}
	
	public Object next() {
		_currPos++;
		return _aggregate.getComponents()[_currPos - 1];
	}
	
	public boolean isDone() {
		return this.currentPosition() == 
				_aggregate.getComponents().length;
	}
	
	public int currentPosition() {
		return _currPos;
	}
}
