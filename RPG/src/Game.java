public class Game {
	
	static boolean lestLimit = true;

public static void main(String[] args){
      Player player1 = new Player("woobin");
//      Player player2 = new Player("황우");
//      System.out.println(player2.name);
      Slime enemy1 = new Slime("빨간슬라임", 50);
//      Monster enemy2 = new Slime("초록슬라임", 100);
      System.out.println(enemy1.kind);
      enemy1.transform();
      
//      player1.attack(enemy1);
//      player1.attack(enemy2);
//      enemy1.attack(player1);
//      player1.attack(enemy1);
//      enemy1.attack(player1);
//      enemy1.attack(player1);
//      player1.attack(enemy1);
//      player1.attack(enemy1);
      // 죽으면 죽었다고 알려주기
      // 죽으면 공격못하기
      
      
      // 무기를 하나 만들어서 그 무기를 장착
      // 해당 무기의 데미지만큼 플레이어의 데미지를 올려주세요
      Weapon weapon1 = new Weapon();
      weapon1.name = "칼";
      weapon1.damage = 30;
      Weapon weapon2 = new Weapon();
      weapon2.name = "총";
      weapon2.damage = 40;
      
      player1.useWeapon(weapon1);
      
      Potion healPotion = new Potion("회복포션(소)", 30, "빨간색", "회복");
//      healPotion
      System.out.println(healPotion.getClass().getName());
      
//      Potion manaPotion = new Potion("마나포션(중)", 50, "파란색", "회복");
//      System.out.println(manaPotion.color);
      
      Golem gol1 = new Golem("스톤골렘", 300);
//      player1.attack(gol1);
      player1.attack(gol1);
      gol1.attack(player1);

      Timer time = new Timer();
//      time.start();
      player1.rest();
      
   }

}