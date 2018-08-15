
public class Main {

	public static void main(String[] args) {

		int mat[][] = { 
				{ 1, 2, 3, 4 },
				{ 5, 6, 7, 8 },
				{ 9, 10, 11, 12},
				{ 4, 3, 2, 1}};

		CalculaLinha linha0 = new CalculaLinha(mat[0], "Thread 0");
		CalculaLinha linha1 = new CalculaLinha(mat[1], "Thread 1");
		CalculaLinha linha2 = new CalculaLinha(mat[2], "Thread 2");
		CalculaLinha linha3 = new CalculaLinha(mat[3], "Thread 3");
		
		linha0.start();
		linha1.start();
		linha2.start();
		linha3.start();
		
		try {
			linha0.join();
			linha1.join();
			linha2.join();
			linha3.join();
		} catch (InterruptedException e){
			System.out.println("Erro nas threads: " + e.getMessage());
		}
		
		int totalMatriz = linha0.getTotalLinha() + linha1.getTotalLinha() + linha2.getTotalLinha() + linha3.getTotalLinha();
		System.out.println("Soma da Matriz: " + totalMatriz);

	}

}
