

public class Counter {

	private int count;
	
	public Counter() {
		count = 0;
	}
		
	public void reset() {
		count = 1;
	}
	
	public void increment() {
		count = count + 2;
	}
	
	public void decrement() {
		count--;
	}
	
	public int getCount() {
		return count;
	}
	
}
