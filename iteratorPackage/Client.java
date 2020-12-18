package iteratorPackage;

public class Client {

	public static void main(String[] args) {
		// Instantiate an aggregate here
		Aggregate myAgg = new Aggregate();
		// Next we want to iterate over the list
		Iterator myIter = myAgg.createIterator();
		
		// Now we can access all elements in the aggregate
		// by the iterator
		while(!myIter.isDone())
			System.out.println(myIter.next());
	}

}
