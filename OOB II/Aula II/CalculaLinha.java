
public class CalculaLinha extends Thread {

	private int totalLinha = 0;
	private int linha[];
	
	CalculaLinha(int linha[], String nomeThread){
		super(nomeThread);
		this.linha = linha;
	}
	
	public void run(){
		
		for (int i = 0; i < linha.length; i++){
			this.totalLinha += linha[i];
		}
		
		System.out.println("Thread " + this.getName() + " acabou!");
		
	}

	public int getTotalLinha(){
		return this.totalLinha;
	}
	
}
