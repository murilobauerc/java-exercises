import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author mrlo
 */
public class Anagrama {
    public static boolean verificaPalavraAnagrama(String s1, String s2) {
        char[] primeiraPalavra = s1.toLowerCase().replaceAll("\\W", "").toCharArray();
        char[] segundaPalavra = s2.toLowerCase().replaceAll("\\W", "").toCharArray();
        // aqui eu uso replaceAll com um regex com um pattern mais facil de usar que é o \\W p remover espaço em branco e pontuação
        // http://www.vogella.com/tutorials/JavaRegularExpressions/article.html
        /* utilizo o método toCharArray() para transformar String em um char de array:
        Exemplo:  "Iracema.toCharArray()" -> {'I', 'r', 'a', 'c', 'e', 'm', 'a'}
        */
        Arrays.sort(primeiraPalavra); /* aqui eu uso o sort para ordernar de forma lexicografica (mas o que é isso? https://www.ime.usp.br/~pf/algoritmos/aulas/string.html)
                                basicamente ordem lexicografica é a ordem entre caracteres dado pela tabela ASCII.
                                    */
        Arrays.sort(segundaPalavra);
        return Arrays.equals(primeiraPalavra, segundaPalavra);
    } 
    
    public static void main(String[] args) {
        java.util.Scanner teclado = new Scanner(System.in);
        System.out.print("Informe uma palavra: ");
        
        String s1 = teclado.nextLine();
        
        System.out.print("Informe outra palavra: ");
        String s2 = teclado.nextLine();
        
        if(verificaPalavraAnagrama(s1,s2)){
            System.out.print(s1 + " é anagrama de " + s2 + "\n");
        }else{
            System.out.print(s1 +  " não é anagrama de " + s2 + "\n");
        }
    }
}
