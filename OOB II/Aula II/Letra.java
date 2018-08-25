
public class Letra extends Thread{

	char letra;
	Thread t;
	
	Letra(char letra, Thread t){
		this.letra = letra;
		this.t = t;
	}
	
	public void run(){
		try {
			if (t != null){
				this.t.join();
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(this.letra);
	}
	
}
