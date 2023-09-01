package pattern.templatemethod;

public class TemplateMethod {
	public static void main(String[] args) {
		AbstConnectHelper abstConnectHelper = new ConcreteConnectHelper();
		
		System.out.println(abstConnectHelper.requestConnection("info"));
	}
}
