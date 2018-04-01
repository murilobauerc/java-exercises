package numeroscomplexosmain;

/**
 *
 * @author mrlo
 */
public class ComplexNumber {
    private double x;
    private double y;
//    https://guiadoestudante.abril.com.br/estudo/resumo-de-matematica-numeros-complexos/

    public ComplexNumber(double x, double y){
        this.x = x;
        this.y = y;
    }
    public ComplexNumber(){
        this.x = 0;
        this.y = 0;
    }
    public static ComplexNumber somar (ComplexNumber a, ComplexNumber b) {
	return new ComplexNumber (a.x + b.x, a.y + b.y); // retornara um novo objeto que é a soma dos dois numeros complexos (isso é como se fosse uma tupla em python?)
    }
    public String toString() {
	return "Estrutura complexa: (" + x + ", " + y + ")" + "\n";
    }
}
