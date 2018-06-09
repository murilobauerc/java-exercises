package exercicio105mrl;

/**
 *
 * @author 122138610
 */
public class Jogador {
    private int matricula;
    private String nome;
    private double salarioBase;
    private String posicao;
    private double bonificacao;
    private double gratificacao;
    private double altura;
    private double peso;

    public Jogador(int matricula, String nome, double salarioBase, String posicao, double bonificacao, double gratificacao, double altura, double peso) {
        this.matricula = matricula;
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.posicao = posicao;
        this.bonificacao = bonificacao;
        this.gratificacao = gratificacao;
        this.altura = altura;
        this.peso = peso;
    }

    public int getMatricula() {
        return this.matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return this.salarioBase;
    }

    public void setSalario(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public String getPosicao() {
        return this.posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public double getBonificacao() {
        return this.bonificacao;
    }

    public void setBonificacao(double bonificacao) {
        this.bonificacao = bonificacao;
    }

    public double getGratificacao() {
        return this.gratificacao;
    }

    public void setGratificacao(double gratificacao) {
        this.gratificacao = gratificacao;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double salarioTotal(double salarioBase, double bonificacao, double gratificacao){
        return (this.salarioBase*2)+this.bonificacao+this.gratificacao;
    }

    public double calculoImc(){
        double imc = this.peso / (this.altura*this.altura);
        return imc;
    }

    @Override
    public String toString() {
        return " - " + matricula + " - " + nome + " - (" + this.posicao+")\n"
                + "... Salário = "+salarioTotal(this.salarioBase, this.bonificacao, this.gratificacao)
                +" (Salário Base: "+this.salarioBase + "; Bonificação: "+ this.bonificacao +"; Gratificação: "+this.gratificacao+")\n"
                + "... IMC = "+calculoImc()+" (Peso: "+this.peso+"; Altura: "+this.altura+")";
    }


}