package pattern.factorymethod;

public class DefaultItemCreator extends AbstItemCreator {

	public DefaultItemCreator() {
		// TODO Auto-generated constructor stub
	}
	@Override
	protected String end(String itemName) {
		System.out.println("Default 마무리 작업!");
		return itemName;
	}

	@Override
	protected String init(String itemName) {
		System.out.println("Default 초기 작업!");
		return itemName;
	}

	@Override
	protected AbstItem createItem(String itemName) {
		return new DefaultItem(itemName);
	}

}
