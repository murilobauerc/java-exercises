
public class Exerc07mrl {

	public static void main(String[] args){
		Noticia threadNoticia = new Noticia();
		HoraCerta threadHora = new HoraCerta();
		
		threadNoticia.start();
		threadHora.start();
		try {
			threadHora.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.exit(0);
		
	}
	
}
