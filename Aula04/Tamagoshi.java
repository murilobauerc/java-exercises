package tamagoshimain;

/**
 *
 * @author 122138610
 */
public class Tamagoshi {
    private String nome;
    private double fome;
    private double saude;
    private int idade;
    
    public Tamagoshi() {
        
    }
    public Tamagoshi(String nome, double fome, double saude) {
        this.nome = nome;
        this.fome = fome;
        this.saude = saude;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setFome(double fome){
        this.fome = fome;
    }
    public double getFome() {
        return fome;
    }
    public void setSaude(double saude){
        this.saude = saude;
    }
    public double getSaude(){
        return saude;
    }
    public double getHumor(double fome, double saude) {
        if (this.fome < 0) {
            this.fome = 0;
        }
        if (this.saude < 0) {
            this.saude = 0;
        }
        if (this.saude > this.fome) {
            return this.saude * 2 - this.fome;
        }
        if (this.fome > this.saude){
            return this.fome * this.saude / 4;
        }
        if (this.fome == this.saude) {
            return (this.saude) / this.fome; 
        }
        return;
    }
}

