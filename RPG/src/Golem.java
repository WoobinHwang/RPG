public class Golem extends Monster {
	
	boolean defenceYn = false;
	String kind = "골렘";

	public Golem(String name, int hp) {
		super(name, hp);
		super.kind = "골렘";
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void powerUp() {
		// TODO Auto-generated method stub
		this.damage *= 3;
	}
	
}
