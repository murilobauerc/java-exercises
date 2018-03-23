package carrodezesseismain;

/**
 *
 * @author mrlo
 */
public class Carro {
    private String cor;
    private double capacidadeMotor;
    private double velocidade;
    
    public Carro() {
        
    }
    public Carro(String cor, double capacidadeMotor) {
        this.cor = cor;
        this.capacidadeMotor = capacidadeMotor;
    }
    
    public void aumentarVelocidade(double qtdVelocidade) {
        if (qtdVelocidade < 0) {
            System.out.print("Pane no carro! Você não pode aumentar a velocidade de forma negativa." + "\n");
        }
        double limiteVelocidade = this.capacidadeMotor * 110;
        if (this.capacidadeMotor == 1.0 && qtdVelocidade > limiteVelocidade) System.out.print("ERRO! Você não pode dirigir mais que o limite máximo de velocidade.\n");
        if (this.capacidadeMotor == 1.6 && qtdVelocidade > limiteVelocidade) System.out.print("ERRO! Você não pode dirigir mais do que o limite máximo de velocidade.\n");
        if (this.capacidadeMotor == 2.0 && qtdVelocidade > limiteVelocidade) System.out.print("ERRO! Você não pode dirigir mais que o limite máximo de velocidade.\n");
        else{
            double velocidadeNova = this.velocidade + qtdVelocidade;
            this.velocidade = velocidadeNova;
        }
    }
    public void reduzirVelocidade(double qtdVelocidade){
        if (qtdVelocidade < 0 ) {
            System.out.print("Pane no carro! Você não pode reduzir a velocidade de forma negativa." + "\n");
        }else{
            double velocidadeNova = this.velocidade - qtdVelocidade;
            if (velocidadeNova >= 60) { // PAREI AQUI
                System.out.print("AIR-BAG ATIVADO! Você reduziu a velocidade de forma abrupta (+60km/h)");
            }else{
                this.velocidade = velocidadeNova;
            }
            if (this.velocidade < 0) {
                System.out.print("Pane no sistema! Você reduziu a velocidade mais do que deveria." + "\n");
            }
        }
    }
    public double getVelocidade() {
        return velocidade;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public void setCapacidadeMotor(double capacidadeMotor) {
        this.capacidadeMotor = capacidadeMotor;
    }
}
