package arraysmain33;
/**
 *
 * @author mrlo
 */
public class ArraysMain33 {
    public static void main(String[] args) {
        // TODO code application logic here
        OperaComArray arrayInt = new OperaComArray(5);
        
        
        System.out.print("Soma: " + arrayInt.somaElementosArray() + "\n");
        System.out.print("Média: " + arrayInt.mediaElementosArray() + "\n");
        System.out.print("Último elemento do array: " + arrayInt.ultimoElementoArray() + "\n");
        System.out.print("Maior elemento do array: " + arrayInt.maiorElementoArray() + "\n");
        
        System.out.print(arrayInt.existeElementoArray(13) ? "Existe no array\n" : "Não existe no array\n");
        System.out.print(arrayInt.existeElementoArray(17) ? "Existe no array\n" : "Não existe no array\n");
        System.out.print(arrayInt.existeElementoArray(10) ? "Existe no array\n" : "Não existe no array\n");
    }
    
}
