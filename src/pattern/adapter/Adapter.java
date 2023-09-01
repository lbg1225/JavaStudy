package pattern.adapter;

public class Adapter {
	public static void main(String[] args) {
		MathAdapter mathAdapter = new MathAdapterImpl();
		
		System.out.println(mathAdapter.twiceOf(4.0f));
		System.out.println(mathAdapter.halfOf(16.0f));
	}
}
