public class Slime extends Monster implements transformable{

	public Slime(String name, int hp) {
		super(name, hp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void powerUp() {
		// TODO Auto-generated method stub
		this.damage *= 2;
	}
	
	@Override
	public void transform() {
		System.out.println("변신!");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void transform2() {
		System.out.println("병신!");
		// TODO Auto-generated method stub
		
	}
}