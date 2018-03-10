package empregadosalonze;
import java.util.Scanner;

public class EmpregadoSalOnzeMain {
    public static void main(String[] args) {
        java.util.Scanner teclado = new Scanner(System.in);
        EmpregadoOnze Empregado = new EmpregadoOnze();
        
        System.out.print("Nome do empregado: ");
        String nomeEmpregado = teclado.nextLine();
        Empregado.setNome(nomeEmpregado);
        
        System.out.print("Salario: ");
        int salEmpregado = teclado.nextInt();
        Empregado.setSalario(salEmpregado);
                
        System.out.print("Percentual de aumento: ");
        Double percentualAumento = teclado.nextDouble();
        
        System.out.print("Novo Salario: " + Empregado.getAumentaSalario(percentualAumento) + "\n");
    }   
}
