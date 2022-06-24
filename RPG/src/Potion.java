
public class Potion {
	String name;
	int recovery;	//회복량
	String color;
	String type;
	
	public Potion(String na, int re, String col, String ty) {
		name = na;
		recovery = re;
		color = col;
		type = ty;
		// TODO Auto-generated constructor stub
	}
	
	public Potion(String na) {
		name = na;
		recovery = 30;
		color = "무색";
		type = "미정";
		// TODO Auto-generated constructor stub
	}
}
