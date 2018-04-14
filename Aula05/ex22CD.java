package ex22main;
public class Cd extends Produto {

    private int numeroDeFaixas;

    public Cd(String nome, double preco, int numeroDeFaixas) {
        super(nome, preco);
        this.numeroDeFaixas = numeroDeFaixas;
    }

    public void setNumeroDeFaixas(int numeroDeFaixas) {
        this.numeroDeFaixas = numeroDeFaixas;
    }

    public int getNumeroDeFaixas() {
        return numeroDeFaixas;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNumero de faixas: " + this.numeroDeFaixas;
    }
}
