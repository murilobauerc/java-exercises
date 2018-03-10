package empregadosalonze;

/**
 *
 * @author mrlo
 */
public class EmpregadoOnze {
    private String nome;
    private double salario;
    
    public void setNome(String nome) {
        this.nome = nome;
    } 
    public void setSalario(double salario){
        this.salario = salario;
        if (salario < 0) {
           this.salario = 0;
        }
    }
    public double getAumentaSalario(double percentualAumento){
        if (salario < 0 || percentualAumento < 0) {
            salario = 0;
        }else{
            salario += salario * (percentualAumento / 100);
        }
        return salario;
    }
}

