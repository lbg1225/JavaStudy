package pattern.strategy;

public class Main {

	public static void main(String[] args) {
		GameCharactor gameCharactor = new GameCharactor();
		
		gameCharactor.attack();
		
		gameCharactor.setWeappon(new Sword());
		gameCharactor.attack();
		
		gameCharactor.setWeappon(new Knife());
		gameCharactor.attack();
	}
}
