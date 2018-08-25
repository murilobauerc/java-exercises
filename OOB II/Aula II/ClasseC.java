
public class ClasseC extends Thread {

	Thread t;
	
	ClasseC(Thread t){
		this.t = t;
	}

	public void run(){
		try {
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("C");
	}
	
}
