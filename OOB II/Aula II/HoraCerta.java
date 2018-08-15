import java.util.Calendar;
import java.util.Date;


public class HoraCerta extends Thread{

	public void run(){
		for(int i = 1; i <= 5; i++){
			Date hora = Calendar.getInstance().getTime();		
			System.out.println(hora.getHours() + ":" + hora.getMinutes() + ":" + hora.getSeconds());
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
