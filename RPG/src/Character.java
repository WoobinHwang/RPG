
public class Character {
	
	String name;
	int hp = 100;
	int mana = 100;
	int damage = 10;
	String kind;
	

	public void rest() {
		System.out.println("현재 체력" + this.hp);
		Timer doRest = new Timer();
		doRest.start();
		System.out.printf("현재체력 %d\n", this.hp + 5);
	}
	
	
	public void attack(Character target) {
		
		System.out.println(target.hp);
		System.out.println(target.damage);
		System.out.println(name);
		
		if(target.hp<=0) {
			System.out.println(target.name+ "은 이미 죽은 상태입니다./n");
			return;
	    }
		
		if("골렘".equals(target.kind)) {
			   if(damage <= 30) {
				   damage = 0;
			   } else {
				   damage -= 10;
				   System.out.println("골렘은 10의 데미지를 덜 받습니다.");
			   }
			   
		   }
		
		int afterHp = target.hp - damage;
	      
	      System.out.printf("%s가 %s를 %d의 데미지로 공격합니다.\n", name, target.name, damage);
	      
	      if(afterHp<=0) { // 적이 이번 공격에 죽은 경우
	    	  afterHp = 0;
	    	  System.out.println("적이 죽었습니다.");
	    	  target.hp = afterHp;
	         return;
	      }
	      
	      System.out.printf("%s의 체력이 %d에서 %d가 되었습니다.\n", target.name, target.hp, afterHp);
	      target.hp = afterHp;
		
		
	}
}
