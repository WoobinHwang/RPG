
public class Timer extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
//		int restTime = 1;
		Thread thread1 = new Thread();
		
		System.out.println();
		

		
		while (Game.lestLimit) {
			for (int i=5; i>=1; i--) {
				try {
					thread1.sleep(1000);
					System.out.println(i);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
			System.out.println();
			System.out.println("체력회복!");
		}
		
		
		
		
	}
}
