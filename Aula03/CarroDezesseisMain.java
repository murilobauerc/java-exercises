package carrodezesseismain;
import java.util.Scanner;
/**
 *
 * @author mrlo
 */
public class CarroDezesseisMain {
    public static void main(String[] args) {
        java.util.Scanner teclado = new Scanner(System.in);
        // TODO code application logic here
        Carro carroTeste = new Carro();
        
        System.out.print("Informe a cor do carro: ");
        String corCarro = teclado.nextLine(); 
        carroTeste.setCor(corCarro);
        
        System.out.print("Informe a capacidade do motor (ex. 1.0, 1.6, 2.0): ");
        double capacidadeMotor = teclado.nextDouble();
        carroTeste.setCapacidadeMotor(capacidadeMotor);    
        // Próximo Passo: crie um menu de opções para o usuário aumentar ou diminuir a velocidade do carro ou sair do programa. A cada alteração da velocidade, exiba a velocidade atual do carro.
        int opcaoDesejada;
        do{
            System.out.print("\n-------------  MENU DE OPÇÕES -------------" + "\n" + "Selecione a opção desejada: ");
            System.out.print("\n1 - Aumentar a velocidade do carro.");
            System.out.print("\n2 - Diminuir a velocidade do carro.");
            System.out.print("\n3 - Sair do programa.");
            System.out.print("\nDigite o numero correspondente a opção: ");
            opcaoDesejada = teclado.nextInt();
            if (opcaoDesejada == 1) {
                System.out.print("Digite a quantidade a ser AUMENTADA na velocidade: ");
                double qtdAumentar = teclado.nextDouble();
                carroTeste.aumentarVelocidade(qtdAumentar);
                System.out.print("Velocidade atual do carro: " + carroTeste.getVelocidade());
            }
            if (opcaoDesejada == 2) {
                System.out.print("Digite a quantidade a ser REDUZIDA na velocidade: ");
                double qtdReduzida = teclado.nextDouble();        
                carroTeste.reduzirVelocidade(qtdReduzida);
                System.out.print("Velocidade atual do carro: " + carroTeste.getVelocidade());
            }
        }while(opcaoDesejada != 3);
    }
    
}
