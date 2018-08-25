
public class ClasseB extends Thread {

	Thread t;
	
	ClasseB(Thread t){
		this.t = t;
	}
	
	public void run(){
		try {
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("B");
	}
	
}
