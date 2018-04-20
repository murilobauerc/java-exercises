import java.util.Scanner;

public class UltimoSobrenomePessoa {
	public static void main(String[] args) {
        java.util.Scanner teclado = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.print("Informe seu nome: ");
		String nome = teclado.nextLine();
		
		if(nome.trim().lastIndexOf(' ') == -1) {
			System.out.print("Sobrenome não informado." + "\n");
		}else{
			String ultimoSobrenome = nome.substring(nome.trim().lastIndexOf(' '));
			System.out.print(ultimoSobrenome + "\n");
		}
	}
}
