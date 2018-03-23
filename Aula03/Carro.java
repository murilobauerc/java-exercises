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
        if (this.velocidade + velocidade > limiteVelocidade) {
            System.out.print("ERRO! Você não pode dirigir mais que o limite máximo de velocidade.\n");
            return;
        }
        this.velocidade += qtdVelocidade;
    }
    public void reduzirVelocidade(double qtdVelocidade){
        if ((velocidade < 0) || (velocidade > this.velocidade)){
            System.out.println("Velocidade invalida");
            return;
	}
	if (velocidade >= 60){
            System.out.println("AIR-BAG disparado");
            this.velocidade = 0;
            return;
	}	
	this.velocidade -= qtdVelocidade;
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

