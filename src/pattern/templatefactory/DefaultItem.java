package pattern.templatefactory;

public class DefaultItem extends AbstItem{
	private String itemName;
	
	public DefaultItem(String itemName) {
		this.itemName = itemName;
	}
	
	@Override
	public void use() {
		System.out.println(itemName +" 사용했습니다!");
	}
}
