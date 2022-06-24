import java.util.Random;

public class Player extends Character{

	Random rd = new Random();
	
	public Player(String name) {
		this.name = name;
		// TODO Auto-generated constructor stub
	}
	   
   
   
   
   public void useWeapon(Weapon weapon) {
	   int afterDamage = this.damage + weapon.damage;
	   this.damage = afterDamage;
	   System.out.printf("%s를 장착하여 공격력이 %d가 되었습니다.\n", weapon.name, this.damage);
   }
   
   public void randomBox() {
	   String[] weaponList = {"총", "칼", "도끼", "방망이"};
	   
   }

}