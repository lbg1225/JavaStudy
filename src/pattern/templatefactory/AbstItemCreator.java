package pattern.templatefactory;

public abstract class AbstItemCreator {
	public AbstItem create(String itemName){
		
		init(itemName);
		AbstItem item = createItem(itemName);
		end(itemName);
		
		return item;
	}
	
	abstract protected String end(String itemName);
	abstract protected String init(String itemName);
	abstract protected AbstItem createItem(String itemName);
	
}
