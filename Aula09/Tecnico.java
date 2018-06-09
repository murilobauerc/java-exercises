package exercicio105mrl;

public class Tecnico {
    private int matricula;
    private String nome;
    private double salario;
    private int qtdtitulos;

    public Tecnico(int matricula, String nome, double salario, int qtdtitulos) {
        this.matricula = matricula;
        this.nome = nome;
        this.salario = salario;
        this.qtdtitulos = qtdtitulos;
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

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getQtdtitulos() {
        return this.qtdtitulos;
    }

    public void setQtdtitulos(int qtdtitulos) {
        this.qtdtitulos = qtdtitulos;
    }

    public double salarioTotal() {
        return this.salario * 2.0D + (double)(this.qtdtitulos * 250);
    }

    public String toString() {
        return " (" + this.matricula + " - " + this.nome + ")\n" + "... Salario = " + this.salarioTotal() + " (Salario Base: " + this.salario + "; Títulos: " + this.qtdtitulos + ")";
    }
}