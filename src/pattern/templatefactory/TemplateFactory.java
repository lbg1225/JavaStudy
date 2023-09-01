package pattern.templatefactory;

public class TemplateFactory {
	public static void main(String[] args) {
		AbstItemCreator creator = new DefaultItemCreator();

		AbstItem item1 = creator.create("나무칼");
		AbstItem item2 = creator.create("나무방패");
		AbstItem item3 = creator.create("나무갑주");
		
		item1.use();
		item2.use();
		item3.use();
	}
}
