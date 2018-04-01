package numeroscomplexosmain;

/**
 *
 * @author mrlo
 */
public class NumerosComplexosMain {
    public static void main(String[] args) {
        // TODO code application logic here
        ComplexNumber alpha = new ComplexNumber(4.5, 6.7);
        ComplexNumber beta = new ComplexNumber(7.8, -9.1);
        System.out.print(alpha); // deve imprimir (4.5, 6.7)
        System.out.print(beta); // deve imrpimir (7.8, -9.1)
        System.out.print(ComplexNumber.somar(alpha, beta)); // deve imprimir 
        
        
        ComplexNumber gama = new ComplexNumber(2, 4.5);
        ComplexNumber delta = new ComplexNumber(1, 9.2);
        
        System.out.print(gama); // deve imprimir (2, 4.5)
        System.out.print(delta); // deve imprimir (1, 9.2)
        System.out.print(ComplexNumber.somar(gama, delta)); // deve imprimir (3.0,13.7)
        
    }    
}
