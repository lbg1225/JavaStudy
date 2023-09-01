package pattern.strategy;

public class GameCharactor {
	
	// 접근점 
	private Weapon weapon;
	
	// 교환가능
	public void setWeappon(Weapon weapon) {
		this.weapon = weapon;
	}
	
	public void attack() {
		if( weapon == null ) {
			System.out.println("맨손공격");
		}else {
			// Delegate
			weapon.attack();
		}
	}
}
