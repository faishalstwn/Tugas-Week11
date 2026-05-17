

public class Counter {

	private int count;
	
	public Counter() {
		count = 0;
	}
		
	public void reset() {
		count = 0;
	}
	
	public void increment() {
		count = count + 3;
	}
	
	public void decrement() {
		count--;
	}
	
	public int getCount() {
		return count;
	}
	
}
