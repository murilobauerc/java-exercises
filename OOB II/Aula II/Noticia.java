import java.util.Random;


public class Noticia extends Thread{

	private String noticias[] = {
			"Inter derrota o Fluminense por 3x0 no dia 13/08/2018",
			"Grêmio enfrenta o Náutico, na batalha dos aflitos em 2005",
			"Inter campeão brasileiro de 2018",
			"Com Rosa Weber no TSE, mulheres assumem pela primeira vez comando da maioria dos tribunais superiores",
			"Fim do mistério: Inter revela número da camisa de Guerrero",
			"Vinícius Jr. é elogiado por Marcelo: 'É o presente e o futuro'",
			"Fulano",
			"Ciclano",
			"Qualquer Noticia",
			"Aspirador de chulé acaba com mau cheiro dos sapatos"
	};
	
	public void run(){
		
		Random rand = new Random();
		while(true){
			int pos = rand.nextInt(noticias.length);
			System.out.println(noticias[pos]);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
}
