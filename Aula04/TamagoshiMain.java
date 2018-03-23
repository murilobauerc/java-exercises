package tamagoshimain;
import java.util.Scanner;
/**
 *
 * @author 122138610
 */
public class TamagoshiMain {
    public static void main(String[] args) {
        java.util.Scanner teclado = new Scanner(System.in);
        // TODO code application logic here
        Tamagoshi tamagoshi = new Tamagoshi();
        
        System.out.print("Informe o nome do tamagoshi:");
        String nomeTamagoshi = teclado.nextLine();
        
        
        System.out.print("Informe a fome:");
        double fomeTamagoshi = teclado.nextDouble();
        tamagoshi.setFome(fomeTamagoshi);
        
        System.out.print("Informe a saude:");
        double saudeTamagoshi = teclado.nextDouble();
        tamagoshi.setSaude(saudeTamagoshi);
        
        System.out.print("Informe a idade:");
        int idadeTamagoshi = teclado.nextInt();
        
        System.out.print("O humor do(a)" + nomeTamagoshi + "é: " + tamagoshi.getHumor(fomeTamagoshi, saudeTamagoshi));
        
    }
    
}
