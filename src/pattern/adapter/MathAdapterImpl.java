package pattern.adapter;

public class MathAdapterImpl implements MathAdapter {
	@Override
	public Double twiceOf(Float num) {
		return Math.twoTime(num);
	}
	
	@Override
	public Double halfOf(Float num) {
		return Math.half(num);
	}
}
