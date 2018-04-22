package palindromo;
import java.util.Scanner;

/**
 *
 * @author mrlo
 */
public class Palindromo {
    public static boolean verificaPalindrome(String s1) {
        String palavraAoContrario = "";
        for(int i = s1.length() -1; i>=0 ; i--){  
           palavraAoContrario += s1.charAt(i);
        }
        return s1.equals(palavraAoContrario);
    }
    
    public static void main(String[] args) {
       // TODO code application logic here
        java.util.Scanner teclado = new Scanner(System.in);
        System.out.print("Informe uma palavra: ");    
        String s1 = teclado.nextLine();

        if(verificaPalindrome(s1)) {
            System.out.print(s1 + " é palíndrome." + "\n");
        }else{
            System.out.print(s1 + " não é palíndrome." + "\n");
        }
    }
    
}
