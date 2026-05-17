class Counter {
	private int count = 0;
	
	public void increment() {
		count++;
	}
	
	public void decrement() {
		count--;
	}
	
	public int getCount() {
		return count;
	}
}

public class Driver {

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		
		System.out.println("Current Count:" + counter.getCount());
		
		counter.increment();
		
		System.out.println("Current Count:" + counter.getCount());
		
		counter.decrement();
		
		System.out.println("Current Count:" + counter.getCount());
		
	}

}
