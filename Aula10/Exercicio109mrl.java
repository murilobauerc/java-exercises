package exercicio109mrl;
import java.util.Scanner;
/**
 *
 * @author 122138610
 */
public class Exercicio109mrl {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        try {
            System.out.print("Digite o primeiro numero: ");
            int primeiroNum = teclado.nextInt();

            System.out.print("Digite o segundo numero: ");
            int segundoNum = teclado.nextInt();

            System.out.println(primeiroNum / segundoNum);
        }catch(ArithmeticException e){
            System.out.println("Mensagem do getMessage: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
